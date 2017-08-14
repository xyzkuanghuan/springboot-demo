package com.xyz.spring.boot.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/****
 * 异常处理，针对controller层产生的所有Exception进行处理 
 * @author linlun
 * @version 1.0
 */
public class AlogExceptionInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("AlogExceptionInterceptor afterCompletion");
	}
	
}
