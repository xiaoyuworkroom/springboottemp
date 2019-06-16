package com.xiaoyu.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("hello")
    public String hello(){
        return "hello world!";
    }


    @GetMapping("md5/{filePath}")
    public String GetMD51(@PathVariable String filePath){

        return "filePath111: " + filePath;
    }
}
