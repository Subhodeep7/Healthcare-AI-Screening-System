package com.healthcare.screening.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PredictionRequest {

    private int age;

    private double glucose;

    private double blood_pressure;

    private double hemoglobin;

    private double cholesterol;

}