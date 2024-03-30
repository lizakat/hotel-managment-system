package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.entity.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FloorRepository extends JpaRepository<Floor, Long> {
}
