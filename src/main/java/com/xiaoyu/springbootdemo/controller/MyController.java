package com.xiaoyu.springbootdemo.controller;

import org.springframework.boot.system.ApplicationHome;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
public class MyController {

    @GetMapping("hello")
    public String hello(){
        return "hello world!";
    }


    @GetMapping("md5/{filePath}")
    public String GetMD51(@PathVariable String filePath) throws IOException {

        String path = new ApplicationHome(this.getClass()).getSource().getParentFile().getParentFile().getPath();
        path += "\\" + filePath;
        String ret = DigestUtils.md5DigestAsHex(new FileInputStream(path));
        return "md5: " + ret;
    }

    @GetMapping("servletPath")
    public String servletPath(){

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();

        String ret = new ApplicationHome(this.getClass()).getSource().getParentFile().getParentFile().getPath();
        return ret;
    }
}
