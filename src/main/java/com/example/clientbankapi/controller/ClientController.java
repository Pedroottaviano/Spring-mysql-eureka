package com.example.clientbankapi.controller;

import com.example.clientbankapi.model.Client;
import com.example.clientbankapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/addClient")
    public void addClient(@RequestBody Client client){
        clientService.addClient(client);
    }

    @GetMapping("/getClients")
    public List<Client> getClients(){
        return clientService.getClients();
    }
}
