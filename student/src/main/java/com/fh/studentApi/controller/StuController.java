package com.fh.studentApi.controller;

import com.fh.result.CommonsReturn;
import com.fh.result.ReturnCode;
import com.fh.studentApi.model.po.Student;
import com.fh.studentApi.model.vo.StudentVo;
import com.fh.studentApi.service.StuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @ClassName StuController
 * @Author 阳
 * @Date 2021/3/4 15:07
 * @Version 1.0
 **/
@RestController
@RequestMapping("/student")
public class StuController {

    @Resource
    private StuService stuService;

    @GetMapping("/getData")
    public CommonsReturn getData(StudentVo vo){
        if (vo.getCurrent() == null || vo.getSize() == null){
            return CommonsReturn.error(ReturnCode.PARAM_ERROR);
        }
        Map map = stuService.getData(vo);
        return CommonsReturn.success(map);
    }

    @PostMapping("/add")
    public CommonsReturn add(Student stu){
        stuService.add(stu);
        return CommonsReturn.success();
    }

    @GetMapping("/getDataById")
    public CommonsReturn getDataById(Integer id){
        Student stu = stuService.getDataById(id);
        return CommonsReturn.success(stu);
    }

    @PostMapping("/update")
    public CommonsReturn update(Student stu){
        if (stu.getId() == null){
            return CommonsReturn.error(ReturnCode.PARAM_ERROR);
        }
        stuService.update(stu);
        return CommonsReturn.success();
    }

    @DeleteMapping("/delete")
    public CommonsReturn delete(Integer id){
        stuService.delete(id);
        return CommonsReturn.success();
    }

}
