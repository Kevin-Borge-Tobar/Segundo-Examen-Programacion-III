package com.borge.service.clients.service;

import com.borge.service.clients.entities.Client;
import com.borge.service.clients.repositories.ClientJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceClientImpl  implements IServiceClient{
    @Autowired
    private ClientJpa clientJpa;

    @Override
    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return(List<Client>) clientJpa.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Client findById(Integer id) {
        return clientJpa.findById(id).orElse(null);
    }


    @Override
    @Transactional
    public Client save(Client client) {
        return clientJpa.save(client);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        clientJpa.deleteById(id);
    }
}
