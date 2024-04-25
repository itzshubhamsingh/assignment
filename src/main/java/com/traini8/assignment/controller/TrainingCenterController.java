package com.traini8.assignment.controller;

import com.traini8.assignment.model.TrainingCenter;
import com.traini8.assignment.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/centers")
public class TrainingCenterController {


    private TrainingCenterService service;
    // Inject the TrainingCenterService ...
    @Autowired
    public TrainingCenterController(TrainingCenterService trainingCenterService){
        this.service = trainingCenterService;
    }

    // .............. FIRST API .......................

    // add mapping for POST/createCenter -- add new Center information
    @PostMapping
    public ResponseEntity<?> createCenter(@Valid @RequestBody TrainingCenter center, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            // If validation errors exist, construct error response with error details
            Map<String, String> errors = new HashMap<>();
            for(FieldError error : bindingResult.getFieldErrors()){
                errors.put(error.getField(), error.getDefaultMessage());
            }
            return ResponseEntity.badRequest().body(errors);
        }
        TrainingCenter savedCenter = service.createCenter(center);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCenter);
    }

    // ........................ SECOND API ...............................

    // expose "/centers" to get the stored center details...
    // It will return the list of all available centers in the database...
    @GetMapping
    public List<TrainingCenter>getAllCenters(){
        return service.getAllCenters();
    }

    // ...................... ADDITIONAL FILTERS ............................

    // expose "/centers/city/{cityName}" to get the list of centers in the particular city
    @GetMapping("/city/{cityName}")
    public List<TrainingCenter> findByCity(@PathVariable String cityName){
        return service.findByAddressCity(cityName);
    }

    // expose "/centers/state/{stateName}" to get the list of centers in the particular state
    @GetMapping("/state/{stateName}")
    public List<TrainingCenter> findByState(@PathVariable String stateName){
        return service.findByAddressState(stateName);
    }

    // expose "/centers/{centerCode}" to get the detail of an individual center by using "centerCode.
    @GetMapping("/{centerCode}")
    public TrainingCenter getCenterByCenterCode(@PathVariable String centerCode){
        TrainingCenter trainingCenter =  service.getCenterByCenterCode(centerCode);
        if(trainingCenter == null)
            throw new RuntimeException(centerCode + " Doesn't exist");
        return trainingCenter;
    }

}
