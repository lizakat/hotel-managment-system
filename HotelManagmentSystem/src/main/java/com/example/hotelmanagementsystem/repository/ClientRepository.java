package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    void deleteByPassportNumber(String number);
}
