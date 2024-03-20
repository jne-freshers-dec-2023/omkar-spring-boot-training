package com.Spring.RestAPI.User;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
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
        List<UserEntity> allemp = userEntityDao.findall();
        return allemp;
    }

    @GetMapping("/users/{id}") // used to retrive the existing data.
    public UserEntity getById( @PathVariable int id){
        UserEntity user=userEntityDao.findone(id);
        if(user==null){ // if user value comes null then it throw the excpetion.
            throw new UserNotFoundExceptio("id"+id);
        }
        return user;
    }
    @DeleteMapping("/users/{id}") // used to retrive the existing data.
    public void  deleteById(@PathVariable int id){
        userEntityDao.Deleteone(id);
    }

    @PostMapping("/users") //it used to post method that means from here we can get the data.
    public void createuser(@Valid @RequestBody UserEntity user){
        userEntityDao.save(user);
//        ResponseEntity.created(null); //it is used to show it post method perfomermed well or not .
}
}
