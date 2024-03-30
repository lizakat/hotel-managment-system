package com.example.hotelmanagementsystem.service;

import com.example.hotelmanagementsystem.entity.Room;
import com.example.hotelmanagementsystem.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public List<Room> listRooms() {
        return roomRepository.findAll(Sort.by(Sort.Direction.ASC, "number"));
    }

    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }

    public void deleteRoom(Long number) {
        roomRepository.deleteById(number);
    }
}
