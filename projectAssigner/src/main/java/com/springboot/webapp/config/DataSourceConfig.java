package com.springboot.webapp.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
//@ComponentScan(basePackages = "com.spring.webapp")
//@EnableJpaRepositories(basePackages= "com.springboot.webapp.repository")
//@EntityScan(basePackages="com.spring.webapp.entity")
public class DataSourceConfig {

	@Primary
	@Bean
	@ConfigurationProperties(prefix="app.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	@ConfigurationProperties(prefix="spring.data.jpa.entity")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder, DataSource dataSource) {
		return builder
					.dataSource(dataSource)
					.build();
	}
	
	@Bean
	@ConfigurationProperties(prefix="security.datasource")
	public DataSource securityDataSource() {
		return DataSourceBuilder.create().build();
	}
	
}
