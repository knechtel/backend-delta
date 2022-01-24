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

    public Client create(Client client) {
        return clientDao.save(client);
    }

    public List<Client> FindAll() {
        return (List<Client>) clientDao.findAllDesc();
    }

    public Client findById(Integer id) {
        return clientDao.findById(id).orElse(null);
    }

    public void update(Client client) {
        if (client.getId() == null) {
            return;
        }

        Client clientEdit = clientDao.findById(client.getId()).orElse(null);

        if (client.getCpf() != null)
            clientEdit.setCpf(client.getCpf());
        if (client.getEmail() != null)
            clientEdit.setEmail(client.getEmail());
        if (client.getName() != null)
            clientEdit.setName(client.getName());

        clientDao.save(clientEdit);
    }

    public void delete(Client client) {
        clientDao.delete(client);
    }
}
