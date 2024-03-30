package com.example.hotelmanagementsystem.service;

import com.example.hotelmanagementsystem.entity.Position;
import com.example.hotelmanagementsystem.repository.PositionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PositionService {
    private final PositionRepository positionRepository;

    public List<Position> listPositions() {
        return positionRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    public Position savePosition(Position position) {
        return positionRepository.save(position);
    }

    public void deletePosition(Long id) {
        positionRepository.deleteById(id);
    }

}
