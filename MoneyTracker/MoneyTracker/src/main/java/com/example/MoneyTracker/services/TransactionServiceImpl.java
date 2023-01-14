package com.example.MoneyTracker.services;

import com.example.MoneyTracker.MyClasses.MyTransaction;
import com.example.MoneyTracker.dao.FriendDao;
import com.example.MoneyTracker.dao.TransactionDao;
import com.example.MoneyTracker.entities.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionDao transactionDao;
    @Override
    public List<Transaction> getTransactions() {
        return null;
    }

    @Override
    public Transaction getTransaction(int transactionId) {
        return null;
    }

    @Override
    public MyTransaction addTransaction(MyTransaction transaction) {
        Transaction t = new Transaction();
        t.setTamount(transaction.getTamount());
        t.setTname(transaction.getTname());
    transactionDao.save(t);
    return transaction;
    }

    @Override
    public Transaction updateTransaction(Transaction transaction) {
        return null;
    }
}
