package com.caching.guavacache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class GuavaCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuavaCacheApplication.class, args);
	}

}
