package com.example.demo.controller;

import com.example.demo.entity.Message;
import com.example.demo.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @Autowired
    private MessageMapper mapper;

    @GetMapping("/")
    public String hello(Model model) {
        Message message = mapper.findById(1L);
        String text = (message != null) ? message.getContent() : "Default Message";
        model.addAttribute("message", text);
        return "hello";
    }
}
