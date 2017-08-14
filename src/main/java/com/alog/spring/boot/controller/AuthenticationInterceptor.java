package com.alog.spring.boot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 用户身份认证
 * @author BinMang
 * @author linlun
 * @since 2017年1月18日
 */
public class AuthenticationInterceptor extends HandlerInterceptorAdapter {
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.err.println("AuthenticationInterceptor preHandle");
		return true;
	}
}
