package com.fh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/log")
public class LogController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;



    @RequestMapping("/test")
    public String test(){
        Integer append = stringRedisTemplate.opsForValue().append("msg", "hello");
        System.out.println(append);
        return "成功";
    }

    @RequestMapping("/test2")
    public String test2(){
        redisTemplate.opsForValue().set("emp-01","empById");
        return "成功2";
    }


}
