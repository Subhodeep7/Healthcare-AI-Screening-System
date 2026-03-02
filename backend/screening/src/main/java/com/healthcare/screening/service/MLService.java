package com.healthcare.screening.service;

import com.healthcare.screening.dto.PredictionRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MLService {

    private final String ML_API_URL = "http://127.0.0.1:8000/predict";

    public String getPrediction(PredictionRequest request){

        RestTemplate restTemplate = new RestTemplate();

        String response = restTemplate.postForObject(
                ML_API_URL,
                request,
                String.class
        );

        return response;
    }

}