package com.fh.api.entity.po;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Document(collection = "user") //声明集合的名字
public class User {


      @Id  //主键id
      private String id;

      private String name;

      private String password;

      @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
      private Date createDate;//用户表    id   name   password  createDate


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
