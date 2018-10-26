package com.awsdemo.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User
{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;
        @Column(name = "name")
        private String name;
        @Column(name = "last_name")
        private String lastName;
        @Column(name = "age")
        private Integer age;

        public User()
        {
        }

        public User(Integer id, String name, String lastName, Integer age)
        {
                this.id = id;
                this.name = name;
                this.lastName = lastName;
                this.age = age;
        }

        public Integer getId()
        {
                return id;
        }

        public void setId(Integer id)
        {
                this.id = id;
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
}
