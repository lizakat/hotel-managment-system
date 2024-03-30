package com.example.hotelmanagementsystem.service;

import com.example.hotelmanagementsystem.entity.ServiceRelationships;
import com.example.hotelmanagementsystem.entity.ServiceRelationshipsId;
import com.example.hotelmanagementsystem.repository.ServiceRelationshipsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServiceRelationshipsService {
    private final ServiceRelationshipsRepository serviceRelationshipsRepository;

    public List<ServiceRelationships> listServiceRelationships() {
        return serviceRelationshipsRepository.findAll();
    }

    public ServiceRelationships saveServiceRelationships(ServiceRelationships serviceRelationships) {
        return serviceRelationshipsRepository.save(serviceRelationships);
    }

    public void deleteServiceRelationships(String passportNumber, String employmentBookNumber) {
        ServiceRelationshipsId id = new ServiceRelationshipsId(passportNumber, employmentBookNumber);
        serviceRelationshipsRepository.deleteById(id);
    }
}
