package com.awsdemo.controller;

import com.awsdemo.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/rest/info")
public class InfoController
{
        @Autowired
        UserDBProxyService userDBProxyService;

        @Autowired
        private Environment environment;

        @GetMapping("/{username}")
        public UserInfo getUserInfo(@PathVariable("username") final String username) throws UnknownHostException
        {
                UserInfo userInfo = userDBProxyService.retriveUserInfo(username);

                UserInfo userInfoResult = new UserInfo(userInfo.getName(), userInfo.getLastName(), userInfo.getAge());
                userInfoResult.setServerPort(environment.getProperty("local.server.port"));
                String hostname = InetAddress.getLocalHost().getHostName();
                userInfoResult.setHostName(hostname);
                userInfoResult.generateInfo();
                return userInfoResult;
        }


}
