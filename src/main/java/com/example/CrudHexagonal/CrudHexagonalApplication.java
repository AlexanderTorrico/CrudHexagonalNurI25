package com.example.CrudHexagonal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudHexagonalApplication {

	private static Logger logger = LoggerFactory.getLogger(CrudHexagonalApplication.class);

	public static void main(String[] args) {
		logger.info("Holam undo");
		SpringApplication.run(CrudHexagonalApplication.class, args);
	}

}
