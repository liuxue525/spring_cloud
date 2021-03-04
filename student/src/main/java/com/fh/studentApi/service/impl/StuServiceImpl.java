package com.fh.studentApi.service.impl;

import com.fh.studentApi.mapper.StuMapper;
import com.fh.studentApi.model.po.Student;
import com.fh.studentApi.model.vo.StudentVo;
import com.fh.studentApi.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName StuServiceImpl
 * @Author 阳
 * @Date 2021/3/4 15:18
 * @Version 1.0
 **/
@Service
public class StuServiceImpl implements StuService {

    @Resource
    private StuMapper stuMapper;

    @Override
    public Map getData(StudentVo vo) {
        Map map = new HashMap();
        Integer count = stuMapper.getCount(vo);
        map.put("count",count);
        List<Student> list = stuMapper.getData(vo);
        map.put("list",list);
        return map;
    }

    @Override
    public void add(Student stu) {
        stuMapper.add(stu);
    }

    @Override
    public Student getDataById(Integer id) {
        return stuMapper.getDataById(id);
    }

    @Override
    public void update(Student stu) {
        stuMapper.update(stu);
    }

    @Override
    public void delete(Integer id) {
        stuMapper.delete(id);
    }
}
