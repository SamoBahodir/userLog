package com.example.user.user;


import com.example.user.log.Log;
import com.example.user.log.LogRepository;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;


@Service
public class UserService {


    public final UserRepository userRepository;

    private final LogRepository logRepository;

    public UserService(UserRepository userRepository, LogRepository logRepository) {
        this.userRepository = userRepository;
        this.logRepository = logRepository;
    }

    public User createUser(RegisterDto registerDto) throws UnknownHostException {
        User user = new User();
        if (registerDto.getUserName().equals(user.getUserName()))
            throw new RuntimeException();
        user.setUserName(registerDto.getUserName());
        user.setEmail(registerDto.getEmail());
        user.setFirst_name(registerDto.getFirst_name());
        user.setGd(registerDto.getGd());
        user.setMid_name(registerDto.getMid_name());
        user.setNatn(registerDto.getNatn());

        Log log = new Log();
        log.setUserName(registerDto.getUserName());
        log.setIpAddress(InetAddress.getLocalHost().getHostAddress());
        userRepository.save(user);
        logRepository.save(log);
        return user;
    }


}