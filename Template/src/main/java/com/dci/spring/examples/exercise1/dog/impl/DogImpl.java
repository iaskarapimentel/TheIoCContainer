package com.dci.spring.examples.exercise1.dog.impl;

import com.dci.spring.examples.exercise1.dog.Breed;
import com.dci.spring.examples.exercise1.dog.Dog;

public class DogImpl implements Dog {

  private final Long id;

  private final String name;

  private final Breed breed;

  public DogImpl(Long id, String name, Breed breed) {
    this.id = id;
    this.name = name;
    this.breed = breed;
  }

  @Override
  public Long getID() {
    return id;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Breed getBreed() {
    return breed;
  }
}
