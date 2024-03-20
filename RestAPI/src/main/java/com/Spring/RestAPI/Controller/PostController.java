package com.Spring.RestAPI.Controller;

import com.Spring.RestAPI.ReposiratoryJPA.UserReposoratory;
import com.Spring.RestAPI.User.Post;
import com.Spring.RestAPI.User.UserEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    private UserReposoratory userReposoratory;

    public PostController(UserReposoratory userReposoratory) {
        this.userReposoratory = userReposoratory;
    }

    @GetMapping("/post")
    public List<UserEntity> getAllpost(){
        List<UserEntity> allemp = userReposoratory.findAll();
        return allemp;
    }


}
