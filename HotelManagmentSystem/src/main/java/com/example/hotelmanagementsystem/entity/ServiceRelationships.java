package com.example.hotelmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "service_relationships")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ServiceRelationshipsId.class)
public class ServiceRelationships {
    @Id
    @Column(name = "pasport_number", length = 9)
    private String passportNumber;

    @Id
    @Column(name = "employment_book_number", length = 16)
    private String employmentBookNumber;
}
