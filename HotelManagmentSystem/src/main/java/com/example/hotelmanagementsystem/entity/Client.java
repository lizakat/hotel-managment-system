package com.example.hotelmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @Column(name = "pasport_number", length = 9)
    private String passportNumber;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "phone_number", length = 13)
    private String phoneNumber;

    @Column(name = "room_number")
    private int roomNumber;

    public Object getId() {
        return this.passportNumber;
    }
}
