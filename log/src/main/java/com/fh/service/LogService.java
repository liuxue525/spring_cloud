package com.fh.service;

import com.fh.entity.po.Log;
import com.fh.entity.vo.PageVo;

import java.util.Map;

public interface LogService {
    Map queryLogData(PageVo vo);

    void deleteLog(Integer id);

    void updateLog(Log log);

    void addLog(Log log);

    Log queryLogById(Integer id);
}
