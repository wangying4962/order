package com.example.order.controller;

import com.example.order.system.OrderType;
import com.example.order.utils.Util;
import com.example.order.vo.OrderTypeVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @RequestMapping("/main")
    public ModelAndView toMain(ModelAndView mav){
        List<OrderTypeVO> list = Util.getList();
        mav.addObject("list",list);
        mav.setViewName("main");
        return mav;
    }

    @RequestMapping("/doOrder")
    public ModelAndView order(ModelAndView mav,OrderType orderType,String numbers){
        System.out.println(orderType+"==="+numbers);
        mav.setViewName("selectOrderPage");
        return mav;
    }



}
