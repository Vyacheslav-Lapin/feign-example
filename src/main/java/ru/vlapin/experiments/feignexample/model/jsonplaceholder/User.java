package ru.vlapin.experiments.feignexample.model.jsonplaceholder;

import static lombok.AccessLevel.PRIVATE;

import lombok.Data;
import lombok.Setter;

@Data
//@Jacksonized
@Setter(PRIVATE)
//@Builder(toBuilder = true)
public class User {

  Long id;
  String name;
  String username;
  String email;
  Address address;
  String phone;
  String website;
  Company company;
}
