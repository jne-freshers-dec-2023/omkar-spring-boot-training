package com.Spring.RestAPI.User;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserEntityDao {

    private  static List<UserEntity> users= new ArrayList<>(); //created list for storing all users.
    public static  int usercount=0;

    static { //basically here i used ++usercout it will allocating increament in usercpunt.
        users.add(new UserEntity(++usercount,"omkar", LocalDate.now().minusYears(20)));
        users.add(new UserEntity(++usercount,"Ram", LocalDate.now().minusYears(32)));
        users.add(new UserEntity(++usercount,"raj", LocalDate.now().minusYears(21)));
    }

    public List<UserEntity> findall(){

        return users;
    }

    public UserEntity save(UserEntity user){
        user.setId(++usercount); //When new user will allocate at that time it will get new id.
        users.add(user);
        return user;
    }

    public UserEntity findone(int id){ //we can write for looplogic also but it strem is always used...
        Predicate<? super UserEntity> predicate=user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void  Deleteone(int id) {
        Predicate<? super UserEntity> predicate=user -> user.getId().equals(id);
        users.remove(id);
    }
}
