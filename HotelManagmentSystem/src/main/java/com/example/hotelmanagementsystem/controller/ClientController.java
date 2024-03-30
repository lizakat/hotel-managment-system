package com.example.hotelmanagementsystem.controller;

import com.example.hotelmanagementsystem.entity.Client;
import com.example.hotelmanagementsystem.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/client") //Client
    public String clients(Model model) {
        model.addAttribute("clients", clientService.listClient());
        return "client";
    }

    @PostMapping("/client/add")
    public String createClient(Client client) {
        clientService.saveClient(client);
        return "redirect:/client";
    }

    @PostMapping("/client/delete")
    public String deleteClient(@RequestParam String number) {
        clientService.deleteClient(number);
        return "redirect:/client";
    }


}
