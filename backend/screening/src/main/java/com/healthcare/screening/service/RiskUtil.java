package com.healthcare.screening.service;

public class RiskUtil {

    public static String classify(double probability){

        if(probability < 0.3){
            return "LOW";
        }

        if(probability < 0.7){
            return "MODERATE";
        }

        return "HIGH";
    }
}