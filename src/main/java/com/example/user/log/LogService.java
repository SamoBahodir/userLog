package com.example.user.log;

import com.example.user.user.User;
import com.example.user.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LogService {
private final UserRepository userRepository;
private final LogRepository logRepository;


    public List<Log> getAll() {
        return logRepository.findAll();
    }
}
