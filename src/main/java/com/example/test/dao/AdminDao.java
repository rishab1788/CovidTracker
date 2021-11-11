package com.example.test.dao;

import com.example.test.model.Admin;
import com.example.test.model.User;
import org.springframework.data.repository.CrudRepository;

public interface AdminDao extends CrudRepository<Admin,Long> {
}
