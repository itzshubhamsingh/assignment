package com.traini8.assignment.service;

import com.traini8.assignment.model.TrainingCenter;

import java.util.List;

public interface TrainingCenterService {
    TrainingCenter createCenter(TrainingCenter trainingCenter); // create a center field in database with all the details.
    List<TrainingCenter> getAllCenters(); // get the list of all available centers present in the database.
    TrainingCenter getCenterByCenterCode(String centerCode); // get the list of an individual center by centerCode.
    List<TrainingCenter> findByAddressCity(String city); // get the list of all centers present in a particular city.
    List<TrainingCenter> findByAddressState(String state); // get the list of all centers present in the particular state.

}
