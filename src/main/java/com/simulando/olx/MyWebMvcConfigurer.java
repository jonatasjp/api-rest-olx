package com.simulando.olx;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer{

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
		PageableHandlerMethodArgumentResolver pageableHandler = new PageableHandlerMethodArgumentResolver();
		pageableHandler.setFallbackPageable(PageRequest.of(0, 15));
		resolvers.add(pageableHandler);
	}
}
