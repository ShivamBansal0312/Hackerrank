package com.ipo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryClientApplication.class, args);
	}

}
