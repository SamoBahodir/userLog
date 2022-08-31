package com.example.user.log;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/log")
@RequiredArgsConstructor
public class LogController {
    private final LogService logService;
@GetMapping
    public List<Log> getAll(){
    return logService.getAll();
}

}
