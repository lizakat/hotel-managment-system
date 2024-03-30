package com.example.hotelmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "provided_service")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ProvidedServiceId.class)
public class ProvidedService {

    @Id
    @Column(name = "pasport_number", length = 9)
    private String passportNumber;

    @Id
    @Column(name = "service_id")
    private int serviceId;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "quantity")
    private int quantity;
}
