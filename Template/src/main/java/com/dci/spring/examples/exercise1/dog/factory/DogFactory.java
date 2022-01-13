package com.dci.spring.examples.exercise1.dog.factory;

import com.dci.spring.examples.exercise1.dog.Breed;
import com.dci.spring.examples.exercise1.dog.Dog;

public interface DogFactory {
  Dog create(Long id, String name, Breed breed);
}
