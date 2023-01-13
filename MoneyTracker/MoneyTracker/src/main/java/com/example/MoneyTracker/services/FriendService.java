package com.example.MoneyTracker.services;

import com.example.MoneyTracker.entities.Friend;

import java.util.List;

public interface FriendService {
    public List<Friend> getFriends();
    public Friend getFriend(int friendId);
    public Friend addFriend(Friend friend);
    public Friend updateFriend(Friend friend);
//    public void deleteFriend(long parseLong);
}
