package com.example.hotelmanagementsystem.repository;

import com.example.hotelmanagementsystem.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {
}
