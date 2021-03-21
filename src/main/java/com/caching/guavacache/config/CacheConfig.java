package com.caching.guavacache.config;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;


@Configuration
@EnableCaching
public class CacheConfig {
	
	Logger logger = LoggerFactory.getLogger(CacheConfig.class);
	
	@Bean
	public CacheManager cacheManager() {
	 SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
	 //CaffeineCache cache1 = new CaffeineCache("book", Caffeine.newBuilder().build());
	 
	 CaffeineCache cache2 = new CaffeineCache("bookData", Caffeine.newBuilder()
	             .expireAfterAccess(30, TimeUnit.MINUTES)
	             .build());
	 simpleCacheManager.setCaches(Arrays.asList(cache2));
	 logger.info("Caffiene Cache");
	 return simpleCacheManager;
	}

}
