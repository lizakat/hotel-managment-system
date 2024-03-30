package com.example.hotelmanagementsystem.service;

import com.example.hotelmanagementsystem.entity.Floor;
import com.example.hotelmanagementsystem.repository.FloorRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class FloorService {

    private final FloorRepository floorRepository;
    private List<Floor> floor = new ArrayList<>();

    public List<Floor> listFloor() {
        return floorRepository.findAll(Sort.by(Sort.Direction.ASC, "number"));
    }

    public Floor saveFloor(Floor floor) {
        return floorRepository.save(floor);
    }

    public List<Floor> listFloorSortedDesc() {
        return floorRepository.findAll(Sort.by(Sort.Direction.DESC, "number"));
    }
    public void deleteFloor(Long number) {
        floorRepository.deleteById(number);
    }

}
