package com.example.Train.repo;

import com.example.Train.entity.TrainSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainScheduleRepo extends JpaRepository<TrainSchedule, Long> {
    List<TrainSchedule> findBySource_StationCodeAndDestination_StationCode(String sourceCode, String destinationCode);
    List<TrainSchedule> findBySource_StationNameAndDestination_StationName(String sourceName, String destinationName);
    //underscore is used for column names, so findBySource = source variable of TrainSchedule and then _StationCode means we will now get into Source station and get its stationCode variable
}
