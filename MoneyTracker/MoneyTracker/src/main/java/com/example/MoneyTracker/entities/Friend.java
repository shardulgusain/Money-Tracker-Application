package com.example.MoneyTracker.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Friend {

    @Id
    private int id;
    private String name;
    private long phnNo ;

    public Friend( int id,String name, long phnNo) {
        this.id = id;
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

    public void setId(int id) {
        this.id = id;
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
