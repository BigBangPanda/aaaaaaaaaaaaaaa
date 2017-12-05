package org.hanzx.testproject;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestprojectApplication {

	private static Logger logger = Logger.getLogger(TestprojectApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
		logger.info("=====spring boot start success====");
	}
}
