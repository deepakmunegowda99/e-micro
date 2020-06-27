package io.emicroservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EMicroServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(EMicroServiceDiscoveryApplication.class, args);
	}

}
