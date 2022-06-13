package com.github.wanderros.encrypt.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.encrypt")
public class EncryptProperties {
    private final static String DEFAULT_KEY = "www.itboyhub.com";
    /**
     * 默认加解密秘钥
     */
    private String key = DEFAULT_KEY;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
