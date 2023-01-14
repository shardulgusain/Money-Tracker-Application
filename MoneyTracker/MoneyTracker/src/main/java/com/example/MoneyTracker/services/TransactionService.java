package com.example.MoneyTracker.services;

import com.example.MoneyTracker.MyClasses.MyTransaction;
import com.example.MoneyTracker.controller.MyController;
import com.example.MoneyTracker.entities.Transaction;

import java.util.List;

public interface TransactionService {
    public List<Transaction> getTransactions();
    public Transaction getTransaction(int transactionId);
    public MyTransaction addTransaction(MyTransaction transaction);
    public Transaction updateTransaction(Transaction transaction);
}
