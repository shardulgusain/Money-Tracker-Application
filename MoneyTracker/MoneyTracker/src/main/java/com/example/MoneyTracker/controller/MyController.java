package com.example.MoneyTracker.controller;

import com.example.MoneyTracker.MyClasses.MyTransaction;
import com.example.MoneyTracker.entities.Friend;
import com.example.MoneyTracker.entities.Transaction;
import com.example.MoneyTracker.services.FriendService;
import com.example.MoneyTracker.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MyController {

    @Autowired
    private FriendService friendService;

    @Autowired
    private TransactionService transactionService;

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
    public Friend updateFriend(@RequestBody Friend friend)
    {
        return this.friendService.updateFriend(friend);
    }

    //Transaction mappings
//    @GetMapping("/transactions")
//    public List<Transaction> getTransactions()
//    {
//        return this.transactionService.getTransactions();
//    }
//    @GetMapping("/friends/{friendId}")
//    public Friend getFriend(@PathVariable String friendId)
//    {
//        return this.friendService.getFriend(Integer.parseInt(friendId));
//    }
    @PostMapping("/transactions")
    public MyTransaction addTransaction(@RequestBody MyTransaction transaction)
    {
//        Transaction t = new Transaction();
//        t.setId(transaction.getId());
//        t.setTamount(transaction.getTamount());
//        t.setTname(transaction.getTname());
        return this.transactionService.addTransaction(transaction);
    }


}
