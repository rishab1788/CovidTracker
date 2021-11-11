package com.example.test.service;

import com.example.test.model.SelfAssesmentForm;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CovidRiskServiceImpl  implements  CovidRiskService{

    @Override
    public int calculateRiskScore(SelfAssesmentForm selfAssesmentForm) {
        // buisness logic for calculating risk
        int riskScore = 5;
        if(selfAssesmentForm.getSymptoms() != null) {
            riskScore = calculateBasedOnSymptoms(selfAssesmentForm.getSymptoms(),riskScore);
        }
        if(selfAssesmentForm.isTravelHistory()){
            riskScore = riskScore + 5;
        }
        if(selfAssesmentForm.isContactWithCovidPatient()) {
            riskScore = riskScore + 10;
        }
        return riskScore;
    }

    private int calculateBasedOnSymptoms(List<String> symptomsList, int riskScore) {
        removeInvalidSymtops(symptomsList);
        if(symptomsList.size() == 0) {
            return riskScore;
        } else if(symptomsList.size() == 1) {
            return riskScore + 40;
        } else if(symptomsList.size() == 2) {
            return riskScore + 55;
        } else {
            return riskScore + 75;
        }
    }

    private void removeInvalidSymtops(List<String> stringList) {
       // here we can remove invalid symptoms that can effect the risk score
    }
}
