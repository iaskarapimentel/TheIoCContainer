package com.dci.spring.examples.exercise1.dog;

import com.dci.spring.examples.exercise1.dog.factory.DogFactory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.dci.spring.examples.exercise1.dog.Breed.*;

//  Without the annotation the class was being ignored - DogService is dependency of DogController
@Service
public class DogService {

  private final DogFactory dogFactory;

//  @Autowired will inject a DogFactory instance here.
  @Autowired
  public DogService(DogFactory dogFactory) {
    this.dogFactory = dogFactory;
  }

  public List<Dog> getDogs() {
    ArrayList<Dog> dogs = new ArrayList<>();
    dogs.add(dogFactory.create(1L, "Liz Maria", POODLE));
    dogs.add(dogFactory.create(2L, "Shilo", HUSKY));
    dogs.add(dogFactory.create(3L, "Alpino", GERMAN_SHEPHERD));
    dogs.add(dogFactory.create(3L, "Zoe", BULLDOG));
    return dogs;
  }
}
// The DogService class has access to the DogFactory class.
