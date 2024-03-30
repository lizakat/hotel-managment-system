package com.example.hotelmanagementsystem.controller;

import com.example.hotelmanagementsystem.entity.ProvidedService;
import com.example.hotelmanagementsystem.service.ProvidedServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class ProvidedServiceController {
    private final ProvidedServiceService providedServiceService;

    @GetMapping("/providedservice")
    public String providedServices(Model model) {
        model.addAttribute("providedServices", providedServiceService.listProvidedServices());
        return "providedservice";
    }

    @PostMapping("/providedservice/add")
    public String createProvidedService(ProvidedService providedService) {
        providedServiceService.saveProvidedService(providedService);
        return "redirect:/providedservice";
    }

    @PostMapping("/providedservice/delete")
    public String deleteProvidedService(@RequestParam String passportNumber, @RequestParam int serviceId) {
        providedServiceService.deleteProvidedService(passportNumber, serviceId);
        return "redirect:/providedservice";
    }

}
