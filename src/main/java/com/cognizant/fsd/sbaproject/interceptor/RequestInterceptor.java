package com.cognizant.fsd.sbaproject.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class RequestInterceptor implements HandlerInterceptor{

	public boolean preHandle(HttpServletRequest request,HttpServletResponse  response){
		return true;
	}
}