package com.example.demo.service;

import com.example.demo.operation.NumberOperation;

public class NumberService {
    /**
     * 把新的数字和原来数字进行相加
     * @param n
     */
    public static void add(int n){
        NumberOperation.getNumberOperation().add(n);
    }

    /**
     * 返回数字
     * @return
     */
    public static int get(){
        return NumberOperation.getNumberOperation().getNumber();
    }

    /**
     * 重新给数字赋值
     * @param n
     */
    public static void set(int n){
        NumberOperation.getNumberOperation().setNumber(n);
    }

    /**
     * 初始化数字
     */
    public static void init(){
        NumberOperation.getNumberOperation().init();
    }
}
