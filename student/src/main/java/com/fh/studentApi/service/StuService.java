package com.fh.studentApi.service;

import com.fh.studentApi.model.po.Student;
import com.fh.studentApi.model.vo.StudentVo;

import java.util.Map;

/**
 * @ClassName StuService
 * @Author 阳
 * @Date 2021/3/4 15:17
 * @Version 1.0
 **/

public interface StuService {
    Map getData(StudentVo vo);

    void add(Student stu);

    Student getDataById(Integer id);

    void update(Student stu);

    void delete(Integer id);
}
