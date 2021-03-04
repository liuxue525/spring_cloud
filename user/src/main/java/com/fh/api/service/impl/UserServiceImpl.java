package com.fh.api.service.impl;

import com.fh.api.entity.po.User;
import com.fh.api.entity.vo.UserVo;
import com.fh.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service   //声明业务逻辑处理层
public class UserServiceImpl implements UserService {

    //注入mogondb的template
    @Autowired
    private MongoTemplate mongoTemplate;



    @Override
    public void addUser(User user) {

        mongoTemplate.save(user);
    }


    @Override
    public Map queryUser(UserVo userVo) {
        Map map=new HashMap();
        //构建查询对象
        Query query=new Query();

        //查询总条数
        long count = mongoTemplate.count(query,User.class);

        //根据分页取数据
        query.skip((userVo.getPage()-1)*userVo.getSize());

        //取
        query.limit(userVo.getSize());

        //查询
        List<User> users = mongoTemplate.find(query, User.class);

        //放入map
        map.put("count",count);
        map.put("data",users);
        return map;
    }
}
