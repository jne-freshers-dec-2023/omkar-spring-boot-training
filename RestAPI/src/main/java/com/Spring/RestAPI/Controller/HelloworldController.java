package com.Spring.RestAPI.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloworldController {

//    @RequestMapping(method = RequestMethod.GET, path ="/hello-world")
    @GetMapping("/hello-world")
    public String helloworld(){
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HellowordBean helloworldBean(){
        return new HellowordBean("Hello World");
    }
 // for path variable
    @GetMapping("/hello-world-bean/path/{name}")
    public HellowordBean helloworldpath(@PathVariable String name){
        return new HellowordBean("Hello World "+name);
    }

}
