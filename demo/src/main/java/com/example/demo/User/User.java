package com.example.demo.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
        private Long userId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
}
