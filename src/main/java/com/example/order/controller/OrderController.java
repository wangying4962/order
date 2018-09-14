package com.example.order.controller;

import com.example.order.system.OrderType;
import com.example.order.utils.Util;
import com.example.order.vo.OrderTypeVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

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
        String[] numStrs = numbers.split(",");
        List<Integer> list = new ArrayList<>();
        for(String numStr:numStrs){
            try{
                int num = Integer.parseInt(numStr);
                list.add(num);
            }catch (NumberFormatException e){
                e.printStackTrace();
            }

        }
        Integer[] nums = new Integer[list.size()];
        list.toArray(nums);
        //排序算法
        switch (orderType.name()){
            case "SELECTORDER":{
                selectOrder(nums);
                break;
            }
            default:
                break;

        }

        mav.addObject("nums",nums);
        mav.setViewName("selectOrderPage");
        return mav;
    }

    //选择排序
    private void selectOrder(Integer[] nums){
        for(int i = 0;i<nums.length;i++){
            int maxIndex = selectMaxIndex(nums, i, nums.length - 1);
            swap(nums,i,maxIndex);
        }
    }



    //查找出最大数的索引
    private int selectMaxIndex(Integer[] nums,int start,int end){
        if(end>=nums.length-1){
            end = nums.length-1;
        }
        if(start < 0){
            start = 0;
        }
        int max = nums[start];
        int maxIndex = start;
        for(int i = start; i <= end; i++){
            if(max < nums[i]){
                max = nums[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private void swap(Integer[] nums,int i,int j){
        int s = nums[i];
        nums[i] = nums[j];
        nums[j] = s;
    }
}
