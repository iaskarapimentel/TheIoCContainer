package com.dci.spring.examples.exercise1.dog;

import com.dci.spring.examples.exercise1.dog.factory.DogFactory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class DogService {

  private final DogFactory dogFactory;

  @Autowired
  public DogService(DogFactory dogFactory) {
    this.dogFactory = dogFactory;
  }

  public List<Dog> getDogs() {
    ArrayList<Dog> dogs = new ArrayList<>();

    // TODO add some dogs to the list!

    return dogs;
  }
}
