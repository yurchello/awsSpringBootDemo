package com.awsdemo.entity;

public class Info
{
        private String name;
        private String lastName;
        private Integer age;
        private Long idCard;
        private String serverPort;
        private String hostName;
        private boolean isValid;


        public void verify(){

                if(idCard % 2 == 0) {
                        isValid = true;
                }else {
                        isValid = false;
                }
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

        public String getServerPort()
        {
                return serverPort;
        }

        public void setServerPort(String serverPort)
        {
                this.serverPort = serverPort;
        }

        public String getHostName()
        {
                return hostName;
        }

        public void setHostName(String hostName)
        {
                this.hostName = hostName;
        }

        public boolean isValid()
        {
                return isValid;
        }

        public void setValid(boolean valid)
        {
                isValid = valid;
        }
}
