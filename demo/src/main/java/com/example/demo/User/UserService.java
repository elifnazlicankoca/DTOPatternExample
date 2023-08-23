package com.example.demo.User;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserDTOMapper userDTOMapper;
    public List<UserDTO> findAllUsers(){
        return userRepository.findAllUsers().stream().map(userDTOMapper).collect(Collectors.toList());
    }
}
