package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages={"com.springboot.empmgmt.*"})
@EntityScan("com.springboot.empmgmt.utilities")
@EnableJpaRepositories("com.springboot.empmgmt.repository")
public class BootDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}
}
