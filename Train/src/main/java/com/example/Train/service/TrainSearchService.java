package com.example.Train.service;

import com.example.Train.entity.TrainSchedule;
import com.example.Train.repo.TrainScheduleRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainSearchService {

    private final TrainScheduleRepo trainScheduleRepo;

    public TrainSearchService(TrainScheduleRepo trainScheduleRepo) {
        this.trainScheduleRepo = trainScheduleRepo;
    }

    public List<TrainSchedule> findTrainByStationCode(String sourceCode, String destinationCode) {
        return trainScheduleRepo.findBySource_StationCodeAndDestination_StationCode(sourceCode.toUpperCase(), destinationCode.toUpperCase()); // source -> column name; stationCode -> source station ke andar ka column hai. same for destination
    }

    public List<TrainSchedule> findTrainByStationName(String sourceName, String destinationName) {
        return trainScheduleRepo.findBySource_StationNameAndDestination_StationName(sourceName.toUpperCase(), destinationName.toUpperCase());
    }
}
