package com.fh.controller;

import com.fh.entity.po.Log;
import com.fh.entity.vo.PageVo;
import com.fh.service.LogService;
import com.fh.utils.result.CommonsReturn;
import com.fh.utils.result.ReturnCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/log")
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping("/queryLogData")
    public CommonsReturn queryLogData(PageVo vo){
        if (vo.getCurrPage() == null){
            return CommonsReturn.error(ReturnCode.ERROR);
        }
        if (vo.getSize() == null){
            return CommonsReturn.error(ReturnCode.ERROR);
        }
        Map map = logService.queryLogData(vo);
        return CommonsReturn.success(map);
    }

    @DeleteMapping("/deleteLog")
    public CommonsReturn deleteLog(Integer id){
        logService.deleteLog(id);
        return CommonsReturn.success(ReturnCode.SUCCESS);
    }

    @PostMapping("/updateLog")
    public CommonsReturn updateLog(Log log){
        logService.updateLog(log);
        return CommonsReturn.success(ReturnCode.SUCCESS);
    }

    @PostMapping("/addLog")
    public CommonsReturn addLog(Log log){
        logService.addLog(log);
        return CommonsReturn.success(ReturnCode.SUCCESS);
    }

    @GetMapping("/queryLogById")
    public CommonsReturn queryLogById(Integer id){
        Log log=logService.queryLogById(id);
        return CommonsReturn.success(log);
    }




}
