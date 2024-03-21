package com.spring.SpringSecurity.Resource;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoResource {
    private Logger logger= (Logger) LoggerFactory.getLogger(getClass());

    private static final List<Todo> TODO_LIST=List .of(new Todo("omkar","learn AWS"),
            new Todo("Raj","Get AWS Certified.."));

    @GetMapping("/todos")
    public List<Todo> helloword(){
        return TODO_LIST;
    }

    @GetMapping("/user/{username}/todo")
    public Todo GetSingle(@PathVariable String username){
        return TODO_LIST.get(0);
    }

    @PostMapping("/todos/{username}")
    public void createtodouser(@PathVariable String username, @RequestBody Todo todo){
        logger.info("crete {} for {}" ,todo , username);
    }
}

record Todo (String username,String description){}
