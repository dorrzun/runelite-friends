package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/friends", consumes = MediaType.APPLICATION_JSON_VALUE)
public class FriendController {
    @PostMapping
    public String createFriend(@RequestBody String entity) {
        return entity;
    }
    
    @GetMapping("/{id}")
    public String getFriend(@RequestParam String param) {
        return new String();
    }
}
