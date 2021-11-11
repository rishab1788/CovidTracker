package com.example.test.service;

import com.example.test.dao.UserDao;
import com.example.test.dao.UserReportDao;
import com.example.test.model.SelfAssesmentForm;
import com.example.test.model.User;
import com.example.test.model.UserReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    UserDao userDao;

    @Autowired
    CovidRiskService covidRiskServiceImpl;

    @Autowired
    UserReportDao userReportDao;

    @Override
    public User createUser(User user) {
       User user1 =  userDao.save(user);
       return user1;
    }

    @Override
    public Long getSelfAssesmentScore(SelfAssesmentForm selfAssesmentForm) {
        // user identification
       Long riskScore = Long.valueOf(covidRiskServiceImpl.calculateRiskScore(selfAssesmentForm));
       // TODO : here this risk score needs to be put in table called ScoreMapping
       userReportDao.save(new UserReport(selfAssesmentForm.getUserId(),riskScore));
       return riskScore;
    }
}
