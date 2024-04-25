package com.traini8.assignment.service;

import com.traini8.assignment.model.TrainingCenter;
import com.traini8.assignment.repository.TrainingCenterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// it is a service class
@Service
public class TrainingCenterServiceImpl implements TrainingCenterService{
    private TrainingCenterRepo repository;

    // inject the TrainingCenterRepo
    @Autowired
    public TrainingCenterServiceImpl(TrainingCenterRepo trainingCenterRepo){
        this.repository = trainingCenterRepo;
    }

    // add the service method for adding a new Training Center in the database.
    @Override
    public TrainingCenter createCenter(TrainingCenter trainingCenter){

        // replace the epoch time (if given by user or not) by the server epoch time.
        trainingCenter.setEpochTime(getCurrentEpochTime());

        return repository.save(trainingCenter);
    }

    // add the service method for getting the list of all Training Centers' details available in database.
    @Override
    public List<TrainingCenter> getAllCenters(){
        return repository.findAll();
    }

    // add the service method for getting the detail of an individual training center by using "centerCode"
    @Override
    public TrainingCenter getCenterByCenterCode(String centerCode){
        return repository.findById(centerCode).get();
    }

    // add the service method for getting the list of centers present in the particular city
    @Override
    public List<TrainingCenter> findByAddressCity(String city){
        return repository.findByAddressCity(city);
    }

    // add service method for getting the list of centers present in the particular state
    @Override
    public List<TrainingCenter> findByAddressState(String state){
        return repository.findByAddressState(state);
    }

    // method to convert UTC time to epoch time
    public long getCurrentEpochTime() {
        return System.currentTimeMillis() / 1000;
    }
}
