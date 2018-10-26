package com.awsdemo.controller;

import com.awsdemo.entity.Info;
import com.awsdemo.entity.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/handler")
public class HandlerController
{

        @Autowired
        UserInfoProxy userInfoProxy;

        @GetMapping("/{username}")
        public Info getUserInfo(@PathVariable("username") final String username)
        {
                Info info = userInfoProxy.retriveUserInfo(username);

                Info userInfoResult = new Info();

                userInfoResult.setName(info.getName());
                userInfoResult.setLastName(info.getLastName());
                userInfoResult.setAge(info.getAge());
                userInfoResult.setIdCard(info.getIdCard());
                userInfoResult.setServerPort(info.getServerPort());
                userInfoResult.setHostName(info.getHostName());
                userInfoResult.verify();
                return userInfoResult;
        }

        @GetMapping("/username2")
        public String getUserInfo(UserDto userDto)
        {

                System.out.println();
                return "HIIIIII";
        }
}
