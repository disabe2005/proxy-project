package com.disabe.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class ProxyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyProjectApplication.class, args);
	}

}
