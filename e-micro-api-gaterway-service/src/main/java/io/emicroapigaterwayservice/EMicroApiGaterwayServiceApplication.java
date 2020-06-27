package io.emicroapigaterwayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
@EnableHystrixDashboard
public class EMicroApiGaterwayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EMicroApiGaterwayServiceApplication.class, args);
	}

}
