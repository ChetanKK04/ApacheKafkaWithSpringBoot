package com.customobject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKafkaCustomObjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootKafkaCustomObjectApplication.class, args);

		System.out.println("custom Object");
	}

}
