package com.example.hotelmanagementsystem.controller;

import com.example.hotelmanagementsystem.entity.Floor;
import com.example.hotelmanagementsystem.service.FloorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class FloorController {
    private final FloorService floorService;

    @GetMapping("/floor") //floor
    public String floors(Model model) {
        model.addAttribute("floors", floorService.listFloor());
        return "floor";
    }

    @PostMapping("/floor/add")
    public String createFloor(Floor floor) {
        floorService.saveFloor(floor);
        return "redirect:/floor";
    }

    @PostMapping("/floor/delete")
    public String deleteFloor(@RequestParam Long number) {
        floorService.deleteFloor(number);
        return "redirect:/floor";
    }


}
