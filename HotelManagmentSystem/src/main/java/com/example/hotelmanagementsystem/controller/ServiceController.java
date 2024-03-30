package com.example.hotelmanagementsystem.controller;

import com.example.hotelmanagementsystem.entity.ServiceEntity;
import com.example.hotelmanagementsystem.service.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class ServiceController {
    private final ServiceService serviceService;

    @GetMapping("/service")
    public String services(Model model) {
        model.addAttribute("services", serviceService.listServices());
        return "service";
    }

    @PostMapping("/service/add")
    public String createService(ServiceEntity serviceEntity) {
        serviceService.saveService(serviceEntity);
        return "redirect:/service";
    }

    @PostMapping("/service/delete")
    public String deleteService(@RequestParam Long serviceId) {
        serviceService.deleteService(serviceId);
        return "redirect:/service";
    }
}
