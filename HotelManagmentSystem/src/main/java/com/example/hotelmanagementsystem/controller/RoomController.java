package com.example.hotelmanagementsystem.controller;

import com.example.hotelmanagementsystem.entity.Room;
import com.example.hotelmanagementsystem.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class RoomController {
    private final RoomService roomService;

    @GetMapping("/room")
    public String rooms(Model model) {
        model.addAttribute("rooms", roomService.listRooms());
        return "room";
    }

    @PostMapping("/room/add")
    public String createRoom(Room room) {
        roomService.saveRoom(room);
        return "redirect:/room";
    }

    @PostMapping("/room/delete")
    public String deleteRoom(@RequestParam Long number) {
        roomService.deleteRoom(number);
        return "redirect:/room";
    }
}
