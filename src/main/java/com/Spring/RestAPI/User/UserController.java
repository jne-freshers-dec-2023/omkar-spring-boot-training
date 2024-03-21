package com.Spring.RestAPI.User;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserEntityDao userEntityDao;

    public UserController(UserEntityDao userEntityDao) {
        this.userEntityDao = userEntityDao;
    }

    @GetMapping("/users")
    public List<UserEntity> getAllUser(){
      return userEntityDao.findall();
    }

    @GetMapping("/users/{id}") // used to retrive the existing data.
    public UserEntity getById(@PathVariable int id){
        UserEntity user=userEntityDao.findone(id);
        if(user==null){ // if user value comes null then it throw the excpetion.
            throw new UserNotFoundExceptio("id"+id);
        }
        return user;
    }

@   PostMapping("/users") //it used to post method that means from here we can pass the data.
    public void createuser(@RequestBody UserEntity user){
        userEntityDao.save(user);
//        ResponseEntity.created(null); //it is used to show it post method perfomermed well or not .
}
}
