package com.example.MoneyTracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    private int id;
    private String tname;
    private int tamount;

    public Transaction( String tname, int tamount) {

        this.tname = tname;
        this.tamount = tamount;
    }

    public Transaction() {
    }

    public int getId() {
        return id;
    }


    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public int getTamount() {
        return tamount;
    }

    public void setTamount(int tamount) {
        this.tamount = tamount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", tname='" + tname + '\'' +
                ", tamount=" + tamount +
                '}';
    }
}
