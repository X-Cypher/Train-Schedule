package com.example.Train.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "train_schedules")
public class TrainSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "train_id", referencedColumnName = "id") //how to write name: tableName_columnName, Here the table is Train and column is id, hence name = "train_id"
    @JsonManagedReference
    private Train train;

    @ManyToOne
    @JoinColumn(name = "source_station_id", referencedColumnName = "id")
    private Station source;

    @ManyToOne
    @JoinColumn(name = "destination_station_id", referencedColumnName = "id")
    private Station destination;

    private String arrivalTime;

    private String departureTime;

}
