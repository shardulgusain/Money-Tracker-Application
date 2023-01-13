package com.example.MoneyTracker.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @GetMapping("/home")
    public String home()
    {
        return "this is home";
    }
    @GetMapping("/frieds")
    public List<Friend> getFriends()
    {

    }
    @GetMapping("/friends/{friendId}")
    public Friend getFriend(@PathVariable String friendId)
    {

    }
    @PostMapping("/friends")
    public Friend addFriend(@RequestBody Friend friend)
    {

    }
    @PutMapping("/friends")
    public Friend updateCourse(@RequestBody Friend friend)
    {

    }

}
