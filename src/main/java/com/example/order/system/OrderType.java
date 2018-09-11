package com.example.order.system;

import java.util.List;

public enum OrderType {
    SELECTORDER("选择排序"),
    BUBBLEORDER("冒泡排序");

    private String name;
    OrderType(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
