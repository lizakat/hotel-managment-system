package com.example.hotelmanagementsystem.service;

import com.example.hotelmanagementsystem.entity.ProvidedService;
import com.example.hotelmanagementsystem.entity.ProvidedServiceId;
import com.example.hotelmanagementsystem.repository.ProvidedServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProvidedServiceService {
    private final ProvidedServiceRepository providedServiceRepository;

    public List<ProvidedService> listProvidedServices() {
        return providedServiceRepository.findAll();
    }

    public ProvidedService saveProvidedService(ProvidedService providedService) {
        return providedServiceRepository.save(providedService);
    }

    public void deleteProvidedService(String passportNumber, int serviceId) {
        ProvidedServiceId id = new ProvidedServiceId(passportNumber, serviceId);
        providedServiceRepository.deleteById(id);
    }
}
