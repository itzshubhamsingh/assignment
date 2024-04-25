package com.traini8.assignment.repository;

import com.traini8.assignment.model.TrainingCenter;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TrainingCenterRepo extends MongoRepository<TrainingCenter, String> {
    // add the custom methods to find by city and state...
    List<TrainingCenter> findByAddressCity(String city);
    List<TrainingCenter> findByAddressState(String state);
}
