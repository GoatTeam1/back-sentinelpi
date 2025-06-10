package com.sentinelpi.sentinelpi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
@SpringBootApplication
@Slf4j
public class SentinelpiApplication {

	public static void main(String[] args) {
		log.info("Starting SentinelpiApplication...");
		SpringApplication.run(SentinelpiApplication.class, args);
	}

}
