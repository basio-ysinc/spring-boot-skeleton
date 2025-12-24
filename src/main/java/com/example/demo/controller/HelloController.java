package com.example.demo.controller;

import com.example.demo.entity.Message;
import com.example.demo.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private MessageMapper messageMapper;

    @GetMapping("/")
    public String hello() {
        Message message = messageMapper.findById(1L);
        return message != null ? message.getContent() : "No message found";
    }
}
