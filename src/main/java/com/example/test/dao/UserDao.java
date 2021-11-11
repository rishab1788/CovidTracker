package com.example.test.dao;

import com.example.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Long> {
}
