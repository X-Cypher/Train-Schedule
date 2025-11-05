package com.example.Train.service;

import com.example.Train.entity.Train;
import com.example.Train.repo.TrainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    private final TrainRepo trainRepo;

    @Autowired
    public TrainService(TrainRepo trainRepo){
        this.trainRepo = trainRepo;
    }

    public List<Train> getAllTrains() {
        return trainRepo.findAll();
    } //train db ka pura data aajayega

    public Train addTrain(Train train) {
        return trainRepo.save(train);
    }
}
