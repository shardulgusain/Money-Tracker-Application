package com.example.MoneyTracker.controller;

import com.example.MoneyTracker.entities.Friend;
import com.example.MoneyTracker.services.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private FriendService friendService;
    @GetMapping("/home")
    public String home()
    {
        return "this is home";
    }
    @GetMapping("/friends")
    public List<Friend> getFriends()
    {
        return this.friendService.getFriends();
    }
    @GetMapping("/friends/{friendId}")
    public Friend getFriend(@PathVariable String friendId)
    {
        return this.friendService.getFriend(Integer.parseInt(friendId));
    }
    @PostMapping("/friends")
    public Friend addFriend(@RequestBody Friend friend)
    {
        return this.friendService.addFriend(friend);
    }
    @PutMapping("/friends")
    public Friend updateCourse(@RequestBody Friend friend)
    {
        return this.friendService.updateFriend(friend);
    }

}
