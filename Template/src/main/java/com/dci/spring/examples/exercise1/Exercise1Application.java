package com.dci.spring.examples.exercise1;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Exercise1Application {

  public static void main(String[] args) {
    SpringApplication.run(Exercise1Application.class, args);
  }

  public CommandLineRunner run(ApplicationContext appContext) {
    return args -> {
      System.out.println();
      System.out.println("============================");
      System.out.println("Printing beans created by the applicationContext");
      System.out.println();

      // gets an array with the name of all beans created in the application context
      String[] beans = appContext.getBeanDefinitionNames();

      // sorts the array alphabetically and prints the name of each on the console
      Arrays.stream(beans).sorted().forEach(System.out::println);
    };
  }
}
