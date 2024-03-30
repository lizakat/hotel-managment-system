package com.example.hotelmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "floor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Floor {
    @Id
    @Column(name="number")
    private int number;

    @Column(name="total_number_of_rooms")
    private int totalNumberOfRooms;
    @Column(name="number_of_available_rooms")
    private int numberOfAvailableRooms;

    public Object getId() {
        return this.number;
    }


}
