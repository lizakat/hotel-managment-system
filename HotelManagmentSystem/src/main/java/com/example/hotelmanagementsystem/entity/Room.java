package com.example.hotelmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "room")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @Column(name = "number")
    private int number;

    @Column(name = "bed_capacity")
    private int bedCapacity;

    @Column(name = "type", length = 255)
    private String type;

    @Column(name = "price_per_night")
    private BigDecimal pricePerNight;

    @Column(name = "floor_number")
    private int floorNumber;

    @Column(name = "booking_number")
    private int bookingNumber;


    public Object getId() {
        return this.number;
    }
}
