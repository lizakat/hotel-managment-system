package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.entity.ProvidedService;
import com.example.hotelmanagementsystem.entity.ProvidedServiceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvidedServiceRepository extends JpaRepository<ProvidedService, ProvidedServiceId> {
        void deleteById(ProvidedServiceId id);
    }