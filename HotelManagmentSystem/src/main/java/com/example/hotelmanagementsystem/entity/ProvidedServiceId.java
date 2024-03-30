package com.example.hotelmanagementsystem.entity;

import java.io.Serializable;

public class ProvidedServiceId implements Serializable {
    private String passportNumber;
    private int serviceId;

    // Обязательный конструктор по умолчанию
    public ProvidedServiceId() {}

    public ProvidedServiceId(String passportNumber, int serviceId) {
        this.passportNumber = passportNumber;
        this.serviceId = serviceId;
    }
}
