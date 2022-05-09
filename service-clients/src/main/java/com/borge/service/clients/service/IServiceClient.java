package com.borge.service.clients.service;

import com.borge.service.clients.entities.Client;

import java.util.List;

public interface IServiceClient {

    public List<Client> findAll();
    public  Client findById(Integer id);
    public  Client save(Client client);

    public void delete(Integer id);


}
