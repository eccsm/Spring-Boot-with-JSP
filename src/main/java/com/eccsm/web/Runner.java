package com.eccsm.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.eccsm.web")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Runner {

	public static void main(String[] args) {
		SpringApplication.run(Runner.class, args);
	}
}