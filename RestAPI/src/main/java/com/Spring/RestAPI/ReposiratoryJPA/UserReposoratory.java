package com.Spring.RestAPI.ReposiratoryJPA;

import com.Spring.RestAPI.User.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposoratory extends JpaRepository<UserEntity,Integer> {

}
