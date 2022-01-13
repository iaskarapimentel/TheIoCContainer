package com.dci.spring.examples.exercise1.dog.factory.impl;

import com.dci.spring.examples.exercise1.dog.Breed;
import com.dci.spring.examples.exercise1.dog.Dog;
import com.dci.spring.examples.exercise1.dog.factory.DogFactory;
import com.dci.spring.examples.exercise1.dog.impl.DogImpl;

public class DogFactoryImpl implements DogFactory {

  @Override
  public Dog create(Long id, String name, Breed breed) {
    return new DogImpl(id, name, breed);
  }
}
