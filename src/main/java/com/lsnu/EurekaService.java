package com.lsnu;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaService {
	
	@PostConstruct
	void setDefaultTimezone() {
		//TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
		 TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
	}
	public static void main(String[] args) {
		SpringApplication.run(EurekaService.class, args);
		 System.out.println("eureka-success");
	}
}
