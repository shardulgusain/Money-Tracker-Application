package com.example.MoneyTracker.MyClasses;

import com.example.MoneyTracker.entities.Friend;

import java.util.*;

public class MyTransaction {

    private int id;
    private String tname;
    private int tamount;
    ArrayList<Integer> l;

    public MyTransaction(int id, String tname, int tamount, ArrayList<Integer> l) {
        this.id = id;
        this.tname = tname;
        this.tamount = tamount;
        this.l = l;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<Integer> getL() {
        return l;
    }

    public void setL(ArrayList<Integer> l) {
        this.l = l;
    }
}

