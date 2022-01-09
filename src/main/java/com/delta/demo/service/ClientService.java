package com.delta.demo.service;

import com.delta.demo.domain.Client;
import com.delta.demo.repository.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by maiquelknechtel on 1/6/22.
 */
@Service
public class ClientService {
    @Autowired
    private ClientDao clientDao;

    public Client create(Client client){
        return clientDao.save(client);
    }

    public List<Client> FindAll(){
        return (List<Client>) clientDao.findAll();
    }

    public Client findById(Integer id){
        return clientDao.findById(id).orElse(null);
    }
}
