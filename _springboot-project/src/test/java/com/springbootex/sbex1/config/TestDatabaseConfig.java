package com.springbootex.sbex1.config;

public class TestDatabaseConfig {

  @Bean
  @Primary
  @ConfigurationProperties(prefix = "spring.datasource")
  
}
