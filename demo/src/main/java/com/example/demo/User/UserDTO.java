package com.example.demo.User;

    public record UserDTO(
            Long userId,
            String firstName,
            String lastName,
            String email
    ){
}
