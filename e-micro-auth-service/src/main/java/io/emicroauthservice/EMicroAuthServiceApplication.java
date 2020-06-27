package io.emicroauthservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EMicroAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EMicroAuthServiceApplication.class, args);
	}

}
