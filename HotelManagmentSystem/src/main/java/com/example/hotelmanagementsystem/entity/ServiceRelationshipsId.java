package com.example.hotelmanagementsystem.entity;

import java.io.Serializable;

public class ServiceRelationshipsId implements Serializable {
    private String passportNumber;
    private String employmentBookNumber;

    public ServiceRelationshipsId() {}
    public ServiceRelationshipsId(String passportNumber, String employmentBookNumber) {
        this.passportNumber = passportNumber;
        this.employmentBookNumber = employmentBookNumber;
    }
}
