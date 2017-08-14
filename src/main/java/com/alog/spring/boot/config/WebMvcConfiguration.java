package com.alog.spring.boot.config;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alog.spring.boot.controller.AuthenticationInterceptor;
import com.alog.spring.boot.controller.AuthorizationInterceptor;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(new AuthenticationInterceptor())
			.addPathPatterns("/**")
			.excludePathPatterns("/token");
		
		registry.addInterceptor(new AuthorizationInterceptor())
			.addPathPatterns("/**")
			.excludePathPatterns("/token");
		
		super.addInterceptors(registry);
	}
	
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter();
		stringHttpMessageConverter.setDefaultCharset(Charset.forName("UTF-8"));
		List<MediaType> supportedMediaTypes = new ArrayList<MediaType>();
		supportedMediaTypes.add(MediaType.TEXT_PLAIN);
		stringHttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);
		
		// TODO Auto-generated method stub
		super.configureMessageConverters(converters);
	}
	
}
