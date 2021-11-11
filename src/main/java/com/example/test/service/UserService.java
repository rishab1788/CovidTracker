package com.example.test.service;

import com.example.test.model.SelfAssesmentForm;
import com.example.test.model.User;

public interface UserService {

    public User createUser(User user);

    Long getSelfAssesmentScore(SelfAssesmentForm selfAssesmentForm);
}
