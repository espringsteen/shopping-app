package com.appian.microservices.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * API Gateway, which is a reverse proxy application that uses Netflix Zuul to forward requests to the
 * service application.
 *
 * @author touré
 */
@SpringBootApplication
@EnableZuulProxy
public class ApiGateway {

  @Bean
  public RequestLoggerFilter requestLoggerFilter() {
    return new RequestLoggerFilter();
  }

  public static void main(String[] args) {
    SpringApplication.run(ApiGateway.class, args);
  }
}
