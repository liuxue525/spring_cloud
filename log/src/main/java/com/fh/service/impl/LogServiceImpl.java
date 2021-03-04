package com.fh.service.impl;

import com.fh.entity.po.Log;
import com.fh.entity.vo.PageVo;
import com.fh.mapper.LogMapper;
import com.fh.service.LogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    @Override
    public Map queryLogData(PageVo vo) {
        Map<String,Object> map = new HashMap();
        Integer count = logMapper.queryLogCount(vo);
        map.put("count",count);
        List<Log> logList = logMapper.queryLogPageVo(vo);
        map.put("list",logList);
        return map;
    }

    @Override
    public void deleteLog(Integer id) {
        logMapper.deleteLog(id);
    }

    @Override
    public void updateLog(Log log) {
        logMapper.updateLog(log);
    }

    @Override
    public void addLog(Log log) {
        logMapper.addLog(log);
    }

    @Override
    public Log queryLogById(Integer id) {
        return logMapper.queryLogById(id);
    }
}
