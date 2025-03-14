package com.vn.vang.user_service;

import com.vn.vang.main.config.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.vn.vang.main"})
@EntityScan(basePackages = {"com.vn.vang.main.entities"})
@EnableJpaRepositories(basePackages = {"com.vn.vang.main.repository"})
@EnableDiscoveryClient
@Import({AxonConfig.class})
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}