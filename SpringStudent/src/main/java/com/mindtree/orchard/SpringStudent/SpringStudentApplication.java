package com.mindtree.orchard.SpringStudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.mindtree.orchard"} )
@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories(basePackages = "com.mindtree.orchard")
@EntityScan(basePackages = "com.mindtree.orchard")

public class SpringStudentApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringStudentApplication.class, args);
	}

}
