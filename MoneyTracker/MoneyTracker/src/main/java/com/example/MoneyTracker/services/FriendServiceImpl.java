package com.example.MoneyTracker.services;

import com.example.MoneyTracker.dao.FriendDao;
import com.example.MoneyTracker.entities.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {

    @Autowired
    private FriendDao friendDao;

    public FriendServiceImpl() {
    }

    @Override
    public List<Friend> getFriends() {
        return friendDao.findAll();
    }

    @Override
    public Friend getFriend(int friendId) {
        return friendDao.getReferenceById(friendId);
    }

    @Override
    public Friend addFriend(Friend friend) {
        friendDao.save(friend);
        return friend;
    }

    @Override
    public Friend updateFriend(Friend friend) {
        friendDao.save(friend);
        return friend;
    }

//    @Override
//    public void deleteFriend(int parseLong) {
//        Friend entity = friendDao.getReferenceById(parseLong);
//        friendDao.delete(entity);
//}
}
