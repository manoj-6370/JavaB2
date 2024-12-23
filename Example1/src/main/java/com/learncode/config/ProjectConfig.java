package com.learncode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.learncode.beans.vehicle;

@Configuration
public class ProjectConfig {

	@Primary
	@Bean(name="vehicle1")
	public vehicle vehicle1() {
		vehicle v1=new vehicle();
		v1.setName("ODI");
		return v1;
	}
	@Bean(name="vehicle2")
	public vehicle vehicle2() {
		vehicle v1=new vehicle();
		v1.setName("BMW");
		return v1;
	}
	
}
