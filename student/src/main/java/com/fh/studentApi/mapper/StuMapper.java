package com.fh.studentApi.mapper;

import com.fh.studentApi.model.po.Student;
import com.fh.studentApi.model.vo.StudentVo;

import java.util.List;

/**
 * @ClassName StuMapper
 * @Author 阳
 * @Date 2021/3/4 15:18
 * @Version 1.0
 **/

public interface StuMapper {
    Integer getCount(StudentVo vo);

    List<Student> getData(StudentVo vo);

    void add(Student stu);

    Student getDataById(Integer id);

    void update(Student stu);

    void delete(Integer id);
}
