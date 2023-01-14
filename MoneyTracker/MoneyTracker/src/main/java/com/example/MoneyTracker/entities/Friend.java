package com.example.MoneyTracker.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Friend {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private long phnNo ;

    public Friend( String name, long phnNo) {
        this.name = name;
        this.phnNo = phnNo;
    }

    public Friend() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPhnNo() {
        return phnNo;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPhnNo(long phnNo) {
        this.phnNo = phnNo;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phnNo=" + phnNo +
                '}';
    }
}
