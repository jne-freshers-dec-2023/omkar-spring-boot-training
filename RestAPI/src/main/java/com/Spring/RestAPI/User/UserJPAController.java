package com.Spring.RestAPI.User;

import com.Spring.RestAPI.ReposiratoryJPA.UserReposoratory;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserJPAController {
    @Autowired
    private UserEntityDao userEntityDao;
    private UserReposoratory userReposoratory;

    public UserJPAController(UserEntityDao userEntityDao,UserReposoratory userReposoratory) {
        this.userReposoratory=userReposoratory;
        this.userEntityDao = userEntityDao;
    }

    @GetMapping("/jpa/users")
    public List<UserEntity> getAllUser(){
        List<UserEntity> allemp = userReposoratory.findAll();
        return allemp;
    }

    @GetMapping("/jpa/users/{id}") // used to retrive the existing data.
    public Optional<UserEntity> getById(@PathVariable int id){
//        UserEntity user=userEntityDao.findone(id);
        Optional<UserEntity>user=userReposoratory.findById(id);  // it will access the findbyis in JPARepo.


        if(user.isEmpty()){ // if user value comes null then it throw the excpetion.
            throw new UserNotFoundExceptio("id"+id);
        }
        return user;
    }



    @DeleteMapping("/jpa/users/{id}") // used to retrive the existing data.
    public void  deleteById(@PathVariable int id){
        userReposoratory.deleteById(id);
    }

    @PostMapping("/jpa/users") //it used to post method that means from here we can get the data.
    public void createuser(@Valid @RequestBody UserEntity user){
        userReposoratory.save(user);
//        ResponseEntity.created(null); //it is used to show it post method perfomermed well or not .
}
}
