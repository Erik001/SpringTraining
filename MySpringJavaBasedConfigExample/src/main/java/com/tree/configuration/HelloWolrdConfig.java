package com.tree.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.tree.spring.practice.HelloWorld;

@Configuration
public class HelloWolrdConfig {
	
	@Bean(initMethod="init", destroyMethod="destroy")
	@Scope("prototype")
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}

}
