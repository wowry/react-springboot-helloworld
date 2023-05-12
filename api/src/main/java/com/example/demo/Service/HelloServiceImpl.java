package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.HelloRepository;

@Service
public class HelloServiceImpl implements HelloService {
  private final HelloRepository repository;

  public HelloServiceImpl(HelloRepository repository) {
    this.repository = repository;
  }

  @Override
  public String hello() {
    String word = this.repository.getWord();

    System.out.println(word);

    return word;
  }
}
