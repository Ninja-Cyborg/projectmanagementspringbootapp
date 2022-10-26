package com.springboot.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages= "com.springboot.webapp.repository")
//@ComponentScan(basePackages = "com.springboot.webapp")
public class ProjectAssignerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectAssignerApplication.class, args);
	}

}
