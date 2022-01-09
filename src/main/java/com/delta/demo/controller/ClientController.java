package com.delta.demo.controller;

import com.delta.demo.domain.Client;
import com.delta.demo.dto.ClientDto;
import com.delta.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by maiquelknechtel on 1/5/22.
 */
@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(value = "client-create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Client create(@RequestBody ClientDto clientDto){
        return clientService.create(clientDto.toBuild(clientDto));
    }
    @RequestMapping(value = "client-findAll", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public List<Client> findAll(){
        return clientService.FindAll();
    }
}
