package com.example.hotelmanagementsystem.controller;

import com.example.hotelmanagementsystem.entity.Position;
import com.example.hotelmanagementsystem.service.PositionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PositionController {
    private final PositionService positionService;

    @GetMapping("/position")
    public String positions(Model model) {
        model.addAttribute("positions", positionService.listPositions());
        return "position";
    }

    @PostMapping("/position/add")
    public String createPosition(Position position) {
        positionService.savePosition(position);
        return "redirect:/position";
    }

    @PostMapping("/position/delete")
    public String deletePosition(@RequestParam Long positionId) {
        positionService.deletePosition(positionId);
        return "redirect:/position";
    }
}
