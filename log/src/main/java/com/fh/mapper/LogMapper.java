package com.fh.mapper;

import com.fh.entity.po.Log;
import com.fh.entity.vo.PageVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface LogMapper {

    Integer queryLogCount(PageVo vo);

    List<Log> queryLogPageVo(PageVo vo);

    void deleteLog(Integer id);

    void updateLog(Log log);

    void addLog(Log log);

    Log queryLogById(Integer id);
}
