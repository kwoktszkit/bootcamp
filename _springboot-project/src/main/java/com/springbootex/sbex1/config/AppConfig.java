package com.springbootex.sbex1.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbootex.sbex1.infra.AppleRestClient;
import com.springbootex.sbex1.infra.RedisHelper;
import com.springbootex.sbex1.infra.RedisObjectMapper;

@Configuration
@EnableCaching
public class AppConfig {

  @Value(value = "${api.finnhub.token}")
  private String token;

  @Bean
  String finnhubToken() {
    return token;
  }

  @Bean
  ModelMapper modelMapper() {
    return new ModelMapper();
  }

  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @Bean
  RedisHelper redisProfileHelper(RedisConnectionFactory factory) {
    return new RedisHelper(factory);
  }

}