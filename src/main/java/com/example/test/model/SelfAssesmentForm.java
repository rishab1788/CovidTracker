package com.example.test.model;

import java.util.List;

public class SelfAssesmentForm {
    /*{"userId":"1","symptoms":["fever","cold","cough"],"travelHistory":true,"contactWithCovidPatient":true}
     */
    Long userId;
    List<String> symptoms;
    boolean travelHistory;
    boolean contactWithCovidPatient;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    public boolean isTravelHistory() {
        return travelHistory;
    }

    public void setTravelHistory(boolean travelHistory) {
        this.travelHistory = travelHistory;
    }

    public boolean isContactWithCovidPatient() {
        return contactWithCovidPatient;
    }

    public void setContactWithCovidPatient(boolean contactWithCovidPatient) {
        this.contactWithCovidPatient = contactWithCovidPatient;
    }
}
