package com.kfka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootChainedProcessingApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootChainedProcessingApplication.class, args);
		System.out.println("Kafka Chained Processing");
	}

}
