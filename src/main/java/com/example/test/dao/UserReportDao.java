package com.example.test.dao;

import com.example.test.model.UserReport;
import org.springframework.data.repository.CrudRepository;

public interface UserReportDao extends CrudRepository<UserReport,Long> {

}
