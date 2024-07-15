package org.diecastfinder.eurekareganddiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekareganddiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekareganddiscoveryApplication.class, args);
	}

}
