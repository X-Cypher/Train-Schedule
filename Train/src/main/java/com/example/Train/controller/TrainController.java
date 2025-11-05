package com.example.Train.controller;

import com.example.Train.entity.Train;
import com.example.Train.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {
    private TrainService trainService;

    @Autowired
    public TrainController(TrainService trainService){
        this.trainService = trainService;
    }

    @GetMapping
    public List<Train> getAllTrains(){
        return trainService.getAllTrains();
    }

    @PostMapping
    public Train addTrain(@RequestBody Train train){
        return trainService.addTrain(train);
    }

}
