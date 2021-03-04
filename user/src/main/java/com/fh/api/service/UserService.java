package com.fh.api.service;

import com.fh.api.entity.po.User;
import com.fh.api.entity.vo.UserVo;

import java.util.Map;

public interface UserService {
    void addUser(User user);

    Map queryUser(UserVo userVo);

    User queryUserByName(String name);
}
