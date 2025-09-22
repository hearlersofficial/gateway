package com.hearlers.gateway.auth

import DefaultObjectMapper
import com.hearlers.api.proto.v1.model.AuthUser
import com.hearlers.com.hearlers.gateway.port.AuthCachePort
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.stereotype.Component

@Component
class AuthCacheAdapter(
    private val redisTemplate: RedisTemplate<String, String>
): AuthCachePort {

    companion object {
        private const val KEY_PREFIX = "auth_user:v1"
        private const val EXPIRE_SECONDS = 60L * 15L
    }
    private val objectMapper = DefaultObjectMapper()
    override fun set(
        code: String, state: String, authUser: AuthUser
    ) {
        val jsonString = objectMapper.writeValueAsString(authUser)
        return redisTemplate.opsForValue().set(
            generateCacheKey(code, state),
            jsonString,
            EXPIRE_SECONDS
        )
    }

    override fun get(
        code: String, state: String
    ): AuthUser? {
        val jsonString = redisTemplate.opsForValue().get(generateCacheKey(code, state))
            ?: return null
        val authUser = objectMapper.readValue(jsonString, AuthUser::class.java)
        return authUser
    }


    private fun generateCacheKey(code: String, state: String): String {
        return "$KEY_PREFIX:${code}_${state}"
    }
}