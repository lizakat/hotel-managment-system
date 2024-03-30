package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.entity.ServiceRelationships;
import com.example.hotelmanagementsystem.entity.ServiceRelationshipsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRelationshipsRepository extends JpaRepository<ServiceRelationships, ServiceRelationshipsId> {
    void deleteById(ServiceRelationshipsId id);

}
