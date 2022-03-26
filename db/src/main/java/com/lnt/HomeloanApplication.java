package com.lnt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan(basePackages ={"com.lnt.domain"})
@EnableJpaRepositories(basePackages ={"com.lnt.repository"})
public class HomeloanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeloanApplication.class, args);
	}

}
