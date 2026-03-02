package com.healthcare.screening.controller;

import com.healthcare.screening.dto.PredictionRequest;
import com.healthcare.screening.service.MLService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PredictionController {

    private final MLService mlService;

    @PostMapping("/predict")
    public String predict(@RequestBody PredictionRequest request){

        return mlService.getPrediction(request);

    }

}