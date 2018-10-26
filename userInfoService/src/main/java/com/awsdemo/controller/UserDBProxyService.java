package com.awsdemo.controller;

import com.awsdemo.entity.UserInfo;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;

//@RibbonClient(name="db-service")
@FeignClient(name="db-service")
public interface UserDBProxyService
{
        @GetMapping("/rest/db/{username}")
        public UserInfo retriveUserInfo (@PathVariable("username") String username);
}
