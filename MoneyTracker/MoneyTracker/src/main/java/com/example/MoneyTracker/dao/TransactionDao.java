package com.example.MoneyTracker.dao;

import com.example.MoneyTracker.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDao extends JpaRepository<Transaction,Integer> {
}
