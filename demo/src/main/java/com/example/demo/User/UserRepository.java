package com.example.demo.User;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserRepository {
    public List<User>findAllUsers(){
        return List.of(new User(1L,"Ayşe","Yesilfasulye","ayse@java.com","ayse123"),
                new User(2L,"Fatma","Yesilfasulye","fatma@java.com","fatma123"),
                new User(3L,"Hayriye","Yesilfasulye","hayriye@java.com","hayriye123"));
    }
}
