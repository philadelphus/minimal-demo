package com.example.demo;

//import jakarta.servlet.DispatcherType;
//import jakarta.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.Ordered;
//import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*
	 * WARN o.s.w.s.h.HandlerMappingIntrospector : Cache miss for REQUEST dispatch
	 * to '/login' (previous null). Performing CorsConfiguration lookup. This is
	 * logged once only at WARN level, and every time at TRACE.
	 */
	// Workaround from
	// https://github.com/spring-projects/spring-framework/issues/31588#issuecomment-1830417987
	// @Bean
	// static FilterRegistrationBean<Filter>
	// handlerMappingIntrospectorCacheFilter(HandlerMappingIntrospector hmi) {
	// // TODO how to replace deprecated HandlerMappingIntrospector with
	// PathPatternParser?
	// Filter cacheFilter = hmi.createCacheFilter();
	// FilterRegistrationBean<Filter> registrationBean = new
	// FilterRegistrationBean<>(cacheFilter);
	// registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	// registrationBean.setDispatcherTypes(EnumSet.allOf(DispatcherType.class));
	// return registrationBean;
	// }

}
