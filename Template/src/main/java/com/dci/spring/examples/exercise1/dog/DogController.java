package com.dci.spring.examples.exercise1.dog;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class DogController {

  private final DogService dogService;

  @Autowired
  public DogController(DogService dogService) {
    this.dogService = dogService;
  }

  @GetMapping("/dogs")
  public List<Dog> getDogs() {
    return dogService.getDogs();
  }
}
