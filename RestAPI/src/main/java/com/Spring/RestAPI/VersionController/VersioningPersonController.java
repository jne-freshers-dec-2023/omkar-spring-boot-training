package com.Spring.RestAPI.VersionController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

     @GetMapping("/v1/person")
      public Person getfirstPerson(){
          return new Person("Omkar mali");
      }
    @GetMapping(path = "/person" ,params = "version=1")
    public Person getfirstPersonRequestParameter(){
        return new Person("Omkar mali");
    }
    @GetMapping("/v2/person")
    public Person1 getsecondPerson1(){
        return new Person1(new Name("Omkar","mali"));
    }
    @GetMapping(path = "/person" ,params = "version=2")
    public Person1 getsecondPerson1Requestparameter(){
        return new Person1(new Name("Omkar","mali"));
    }

}
