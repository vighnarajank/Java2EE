package com.onebill.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onebill.annotation.bean.Car;

@Configuration
public class CarTyreConfig {

	@Bean
	public Car getTyre() {
		return new Car();
	}
	
}
