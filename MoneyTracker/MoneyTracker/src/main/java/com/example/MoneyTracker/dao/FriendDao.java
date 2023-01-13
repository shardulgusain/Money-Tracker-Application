package com.example.MoneyTracker.dao;

import com.example.MoneyTracker.entities.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendDao extends JpaRepository<Friend,Integer> {

}
