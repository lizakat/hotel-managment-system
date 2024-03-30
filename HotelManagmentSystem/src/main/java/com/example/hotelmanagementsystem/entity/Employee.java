package com.example.hotelmanagementsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @Column(name = "employment_book_number", length = 16)
    private String employmentBookNumber;

    @Column(name = "name", length = 255)
    private String name;

    @Column(name = "working_experience_month")
    private int workingExperienceMonth;

    @Column(name = "position_id")
    private int positionId;

    public Object getId() {
        return this.employmentBookNumber;
    }
}
