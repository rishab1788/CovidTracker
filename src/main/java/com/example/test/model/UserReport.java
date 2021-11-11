package com.example.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    Long userId;
    Long riskScore;

    public UserReport(Long userId, Long riskScore) {
        this.userId = userId;
        this.riskScore = riskScore;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRiskScore() {
        return riskScore;
    }

    public void setRiskScore(Long riskScore) {
        this.riskScore = riskScore;
    }

}
