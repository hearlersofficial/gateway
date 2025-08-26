package com.hearlers.gateway.config.security;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "grpc.targets")
public class GrpcTargets {
    private String nest;
    private String spring;

    public String getNest() { return nest; }
    public void setNest(String nest) { this.nest = nest; }

//    public String getSpring() { return spring; }
//    public void setSpring(String spring) { this.spring = spring; }
}
