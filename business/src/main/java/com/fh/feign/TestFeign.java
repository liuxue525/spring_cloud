package com.fh.feign;

import com.fh.entity.vo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(value = "USER",fallback=ServiceFallbackFactory.class)
public interface TestFeign {
        @RequestMapping(value = "api/user/queryUserByName",method = RequestMethod.POST)
        public User queryUserByName(String name);
        @RequestMapping(value = "api/user/addUser",method = RequestMethod.POST)
        public Map addUser(User user);
}
