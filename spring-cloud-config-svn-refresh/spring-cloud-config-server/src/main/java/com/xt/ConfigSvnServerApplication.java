package com.xt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigSvnServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigSvnServerApplication.class, args);
	}
}
