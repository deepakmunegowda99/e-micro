package io.emicroproductservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EMicroProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EMicroProductServiceApplication.class, args);
	}

}
