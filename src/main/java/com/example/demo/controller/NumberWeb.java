package com.example.demo.controller;

import com.example.demo.operation.NumberOperation;
import com.example.demo.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class NumberWeb {
    @Autowired

    /**
     * GET请求,页面加载时执行
     */
    @ResponseBody
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String init(){
//        NumberService.init();
//        return "初始化为: "+NumberService.get();
        return "helloworld web";
    }

    /**
     * POST请求,对数字进行运算
     * @param n
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String get(int n){
        NumberService.add(n);
        return "新的数字: "+NumberService.get();
    }


    /**
     * PUT请求,重新设置数字的值
     * @param n
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/index",method = RequestMethod.PUT)
    public String set(int n){
        NumberService.set(n);
        return "新的数字: "+NumberService.get();
    }


}


