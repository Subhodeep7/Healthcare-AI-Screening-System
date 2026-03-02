package com.healthcare.screening.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PredictionResponse {

    private double probability;
    private String risk;

}