package com.fh.entity.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/* 接参的bean对象  */
public class PropertyParams {

    //当前页
    private  Integer page;
    //每页显示条数
    private  Integer limit;
    //起始下标
    private Integer startIndex;

    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date kaishi;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date jieshu;


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getKaishi() {
        return kaishi;
    }

    public void setKaishi(Date kaishi) {
        this.kaishi = kaishi;
    }

    public Date getJieshu() {
        return jieshu;
    }

    public void setJieshu(Date jieshu) {
        this.jieshu = jieshu;
    }
}
