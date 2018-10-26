package com.awsdemo.repository;

import com.awsdemo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>
{
        User findOneByName(String name);
}
