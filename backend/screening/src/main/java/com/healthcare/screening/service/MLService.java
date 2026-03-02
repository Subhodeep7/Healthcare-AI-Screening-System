package com.healthcare.screening.service;

import com.healthcare.screening.dto.PredictionRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class MLService {

    private final String ML_API_URL = "http://127.0.0.1:8000/predict";

    public Map<String,Object> getPrediction(PredictionRequest request){

        RestTemplate restTemplate = new RestTemplate();

        Map<String,Double> mlResponse =
                restTemplate.postForObject(
                        ML_API_URL,
                        request,
                        Map.class
                );

        return Map.of(

                "diabetes",
                Map.of(
                        "probability", mlResponse.get("diabetes_risk"),
                        "risk", RiskUtil.classify(mlResponse.get("diabetes_risk"))
                ),

                "heart_disease",
                Map.of(
                        "probability", mlResponse.get("heart_disease_risk"),
                        "risk", RiskUtil.classify(mlResponse.get("heart_disease_risk"))
                ),

                "anemia",
                Map.of(
                        "probability", mlResponse.get("anemia_risk"),
                        "risk", RiskUtil.classify(mlResponse.get("anemia_risk"))
                ),

                "hypertension",
                Map.of(
                        "probability", mlResponse.get("hypertension_risk"),
                        "risk", RiskUtil.classify(mlResponse.get("hypertension_risk"))
                )

        );
    }
}