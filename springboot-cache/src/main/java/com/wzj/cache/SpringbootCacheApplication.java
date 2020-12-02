package com.wzj.cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.wzj.cache.mapper")
@EnableCaching
public class SpringbootCacheApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringbootCacheApplication.class, args);
  }
}
