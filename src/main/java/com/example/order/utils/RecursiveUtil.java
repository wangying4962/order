package com.example.order.utils;

public class RecursiveUtil {
    //递归获取
    public static Integer getFibonacci(int n){
        if(n<=1){
            return n;
        }
        return getFibonacci(n-1)+getFibonacci(n-2);
    }
    //使用for循环获取
    public static Integer getForFibonacci(int n){
        int pre = 0;
        int current = 1;
        int next = 0;
        if(n<=1){
            return n;
        }else{
            for(int i=2;i<=n;i++){
                next = pre + current;
                pre = current;
                current = next;
            }
            return next;
        }
    }
}
