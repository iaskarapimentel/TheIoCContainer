package com.dci.spring.examples.exercise1.dog;

import java.io.Serializable;

public interface Dog extends Serializable {

  Long getID();

  String getName();

  Breed getBreed();
}
