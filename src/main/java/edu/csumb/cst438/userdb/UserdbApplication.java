package edu.csumb.cst438.userdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


//@EnableEurekaClient
@SpringBootApplication
public class UserdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserdbApplication.class, args);
	}
}
