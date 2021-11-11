package com.example.test.service;

import com.example.test.model.SelfAssesmentForm;

public interface CovidRiskService {
    public int calculateRiskScore(SelfAssesmentForm selfAssesmentForm);
}
