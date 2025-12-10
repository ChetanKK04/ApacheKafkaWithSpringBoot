package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKafkaDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootKafkaDemoApplication.class, args);
		System.out.println("Kafka App running ");
	}


}
