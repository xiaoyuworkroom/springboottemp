package com.xiaoyu.springbootdemo.controller;

import org.springframework.boot.system.ApplicationHome;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

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

    @GetMapping("servletPath")
    public String servletPath(){

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        //String ret = request.getContextPath();

        //ClassUtils.getDefaultClassLoader().getResource("").getPath();

        String ret = new ApplicationHome(this.getClass()).getSource().getParentFile().getParentFile().getPath();
//        String ret = request.getServletPath();
        return ret;
    }
}
