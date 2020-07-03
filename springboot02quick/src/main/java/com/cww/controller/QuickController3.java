package com.cww.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "person")
public class QuickController3 {

    private String name;
    private String addr;

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick2() {
        // 获取配置文件信息
        System.out.println(name);
        System.out.println(addr);
        System.out.println("哈哈哈哈");
        return "name: " + name + ",addr: " + addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
