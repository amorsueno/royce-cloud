package com.royce.cloud.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * @author Royce
 * @version v1.0.0
 * @title ResourceServerConfig
 * @description 资源服务器配置
 * @date 2020/4/11
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
				.requestMatchers().antMatchers("/**")
				.and()
				.authorizeRequests()
				.antMatchers("/**").authenticated();
	}
}
