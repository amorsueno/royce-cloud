package com.royce.cloud.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author Royce
 * @version v1.0.0
 * @title AuthorizationServerConfigure
 * @description 认证服务安全配置
 * @date 2020/4/11
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfigure extends AuthorizationServerConfigurerAdapter {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private RedisConnectionFactory redisConnectionFactory;
	@Autowired
	private PasswordEncoder passwordEncoder;



}
