package com.example.order.utils;

import com.example.order.system.OrderType;
import com.example.order.vo.OrderTypeVO;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static List<OrderTypeVO> getList(){
        OrderType[] values = OrderType.values();
        List<OrderTypeVO> list = new ArrayList<>();
        for(OrderType value : values){
            OrderTypeVO orderTypeVO = new OrderTypeVO();
            orderTypeVO.setName(value.getName());
            orderTypeVO.setValue(value.name());
            list.add(orderTypeVO);
        }
        return list;
    }
}
