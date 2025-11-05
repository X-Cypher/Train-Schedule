package com.example.Train.controller;

import com.example.Train.entity.Station;
import com.example.Train.entity.Train;
import com.example.Train.entity.TrainSchedule;
import com.example.Train.repo.StationRepo;
import com.example.Train.repo.TrainRepo;
import com.example.Train.repo.TrainScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class Test {

    @Autowired
    TrainRepo trainRepo;

    @Autowired
    StationRepo stationRepo;

    @Autowired
    TrainScheduleRepo trainScheduleRepo;

    @GetMapping
    public void test(){

        Station delhi=new Station(null,"New Delhi","NDLS");
        Station mumbai=new Station(null,"Mumbai central","CSMT");
        Station kolkata=new Station(null,"Kolkata","KOAA");
        Station chennai=new Station(null,"Chennai Central","MAS");
//        Station hyderabad = new Station(null, "Hyderabad", "HYD");

        stationRepo.saveAll(List.of(delhi,mumbai,kolkata,chennai));

        Train rajdhani = new Train(null,"Rajdhani Express","12306",null);
        Train durunto = new Train(null,"Durunto Express","12260",null);
        Train shatabdi = new Train(null,"Shatabdi Express","12043",null);

        trainRepo.saveAll(List.of(rajdhani,durunto,shatabdi));


        TrainSchedule sc1=new TrainSchedule(null,rajdhani,delhi,mumbai,"06:00","14:00");
        TrainSchedule sc2=new TrainSchedule(null,durunto,mumbai,kolkata,"08:00","21:00");
        TrainSchedule sc3=new TrainSchedule(null,shatabdi,kolkata,chennai,"10:30","22:00");
//        TrainSchedule sc4 = new TrainSchedule(null, shatabdi, kolkata, hyderabad, "10:30", "15:00");

        trainScheduleRepo.saveAll(List.of(sc1,sc2,sc3));

        System.out.println("Data inserted in database...");
    }

}

