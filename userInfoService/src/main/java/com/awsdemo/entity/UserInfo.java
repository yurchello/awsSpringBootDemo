package com.awsdemo.entity;

import java.util.Random;

public class UserInfo
{
        private String name;
        private String lastName;
        private Integer age;
        private Long idCard;
        private String serverPort;
        private String hostName;

        public UserInfo()
        {
        }

        public UserInfo(String name, String lastName, Integer age)
        {
                this.name = name;
                this.lastName = lastName;
                this.age = age;
        }

        public String getServerPort()
        {
                return serverPort;
        }

        public void setServerPort(String serverPort)
        {
                this.serverPort = serverPort;
        }

        public void generateInfo(){
                this.idCard = new Random().nextLong();
        }

        public String getName()
        {
                return name;
        }

        public void setName(String name)
        {
                this.name = name;
        }

        public String getLastName()
        {
                return lastName;
        }

        public void setLastName(String lastName)
        {
                this.lastName = lastName;
        }

        public Integer getAge()
        {
                return age;
        }

        public void setAge(Integer age)
        {
                this.age = age;
        }

        public Long getIdCard()
        {
                return idCard;
        }

        public void setIdCard(Long idCard)
        {
                this.idCard = idCard;
        }

        public void setHostName(String hostName)
        {
                this.hostName = hostName;
        }

        public String getHostName()
        {
                return hostName;
        }
}
