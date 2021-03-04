package com.fh.studentApi.model.vo;

import com.fh.studentApi.model.po.Student;

/**
 * @ClassName StudentVo
 * @Author 阳
 * @Date 2021/3/4 15:12
 * @Version 1.0
 **/

public class StudentVo extends Student {

    private Integer current;

    private Integer size;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
