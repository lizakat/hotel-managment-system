package com.example.hotelmanagementsystem.service;

import com.example.hotelmanagementsystem.entity.ServiceEntity;
import com.example.hotelmanagementsystem.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;

    public List<ServiceEntity> listServices() {
        return serviceRepository.findAll(Sort.by(Sort.Direction.ASC, "type"));
    }

    public ServiceEntity saveService(ServiceEntity serviceEntity) {
        return serviceRepository.save(serviceEntity);
    }

    public void deleteService(Long id) {
        serviceRepository.deleteById(id);
    }
}
