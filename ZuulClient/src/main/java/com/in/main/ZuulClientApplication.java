package com.in.main;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.test.OAuth2ContextConfiguration;
import org.springframework.security.oauth2.client.token.AccessTokenProvider;
import org.springframework.security.oauth2.client.token.DefaultAccessTokenRequest;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsAccessTokenProvider;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.common.AuthenticationScheme;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import com.jayway.jsonpath.internal.path.ArraySliceOperation;

@SpringBootApplication
@EnableZuulProxy
@EnableOAuth2Sso
public class ZuulClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulClientApplication.class, args);
	}
	
	@Bean
	public SimpleFilter simpleFilter(){
		return new SimpleFilter();
	}
	
	
	/*@Autowired
	private OAuth2ClientContext oauth2Context;
	
	@Bean
	@Qualifier("myRestTemplate")
	@Primary
	public OAuth2RestOperations restTemplate(){
		
		OAuth2RestTemplate template = new OAuth2RestTemplate(fullAccessClientDetails(),oauth2Context);
		template.setAccessTokenProvider(userAccessTokenProvider());
		return template;		
	}
	
	@Bean
	public AccessTokenProvider userAccessTokenProvider(){
		ClientCredentialsAccessTokenProvider accessTokenProvider = new ClientCredentialsAccessTokenProvider();
		return accessTokenProvider;
	}
	
	@Bean
	@ConfigurationProperties("security.oauth2.client")
	public OAuth2ProtectedResourceDetails fullAccessClientDetails(){
		ClientCredentialsResourceDetails resource = new ClientCredentialsResourceDetails();
		resource.setAccessTokenUri("http://10.145.64.144:8080/auth/oauth/token");
		resource.setClientId("");
		resource.setClientSecret("password");
		resource.setAuthenticationScheme(AuthenticationScheme.form);
		resource.setGrantType("client_credentials");
		return resource;
	}*/
	
}



