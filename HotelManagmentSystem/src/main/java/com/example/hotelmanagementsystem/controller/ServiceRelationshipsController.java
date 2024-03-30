package com.example.hotelmanagementsystem.controller;

import com.example.hotelmanagementsystem.entity.ServiceRelationships;
import com.example.hotelmanagementsystem.entity.ServiceRelationshipsId;
import com.example.hotelmanagementsystem.service.ServiceRelationshipsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class ServiceRelationshipsController {
    private final ServiceRelationshipsService serviceRelationshipsService;

    @GetMapping("/servicerelationships")
    public String serviceRelationships(Model model) {
        model.addAttribute("serviceRelationships", serviceRelationshipsService.listServiceRelationships());
        return "servicerelationships";
    }

    @PostMapping("/servicerelationships/add")
    public String createServiceRelationships(ServiceRelationships serviceRelationships) {
        serviceRelationshipsService.saveServiceRelationships(serviceRelationships);
        return "redirect:/servicerelationships";
    }

    @PostMapping("/servicerelationships/delete")
    public String deleteServiceRelationships(@RequestParam String passportNumber, @RequestParam String employmentBookNumber) {
        serviceRelationshipsService.deleteServiceRelationships(passportNumber, employmentBookNumber);
        return "redirect:/servicerelationships";
    }

}
