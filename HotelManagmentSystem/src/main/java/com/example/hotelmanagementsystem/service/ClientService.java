package com.example.hotelmanagementsystem.service;

import com.example.hotelmanagementsystem.entity.Client;
import com.example.hotelmanagementsystem.repository.ClientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public List<Client> listClient() {
        return clientRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Transactional
    public void deleteClient(String number) {
        clientRepository.deleteByPassportNumber(number);
    }
}
