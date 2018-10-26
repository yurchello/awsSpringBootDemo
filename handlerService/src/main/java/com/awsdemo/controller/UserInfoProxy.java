package com.awsdemo.controller;

import com.awsdemo.entity.Info;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RibbonClient(name="user-info-service")
@FeignClient(name="user-info-service")
public interface UserInfoProxy
{
        @GetMapping("/rest/info/{username}")
        public Info retriveUserInfo (@PathVariable("username") String username);
}
