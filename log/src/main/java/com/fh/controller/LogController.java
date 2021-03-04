package com.fh.controller;

import com.fh.entity.po.Log;
import com.fh.entity.vo.ResultData;
import com.fh.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/log")
public class LogController {

    @Resource
    LogService logService;

    public ResultData addLog(Log log){
        logService.addLog(log);
        return ResultData.success(null);
    }





}
