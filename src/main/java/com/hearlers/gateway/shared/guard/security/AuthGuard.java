package com.hearlers.gateway.shared.guard.security;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) // 메서드에 적용
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthGuard {
}