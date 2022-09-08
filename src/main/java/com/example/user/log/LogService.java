package com.example.user.log;

import com.example.user.user.UserEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LogService {
    private final UserEntityRepository userRepository;
    private final LogRepository logRepository;


    public List<Log> getAll() {
        return logRepository.findAll();
    }
}
