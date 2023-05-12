package com.example.demo.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {
  @Override
  public String getWord() {
    return "Hello from Spring Boot!";
  }
}
