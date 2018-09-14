package com.example.order.controller;

import com.example.order.utils.RecursiveUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/recursive")
public class RecursiveController {
    //斐波那契数列(获取第n个数字)
    @RequestMapping("/main")
    public ModelAndView main(ModelAndView mav){
        mav.setViewName("recursive/main");
        return mav;
    }

    //斐波那契数列(获取第n个数字)
    @RequestMapping("/fibonacci")
    public ModelAndView fibonacciSequence(ModelAndView mav,Integer numbers){
        Integer fibonacci = RecursiveUtil.getFibonacci(numbers);
        Integer fibonacci2 = RecursiveUtil.getForFibonacci(numbers);
        mav.addObject("fibonacci",fibonacci);
        mav.addObject("fibonacci2",fibonacci2);
        mav.setViewName("recursive/fibonacci");
        return mav;
    }


}
