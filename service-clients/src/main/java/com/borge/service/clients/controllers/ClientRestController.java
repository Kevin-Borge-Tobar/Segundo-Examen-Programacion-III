package com.borge.service.clients.controllers;


import com.borge.service.clients.entities.Client;
import com.borge.service.clients.service.IServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//la Anotacion inferior permite que los servicios indicados puedan consumir el api
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class ClientRestController {

    @Autowired
    private IServiceClient clientService;

    @GetMapping("/clients")
    public List<Client> listClients(){
     return clientService.findAll();
    }
    @GetMapping("/clients/{id}")
    public Client view(@PathVariable Integer id){
        return  clientService.findById(id);
    }

    @PostMapping("/clients")
    @ResponseStatus(HttpStatus.CREATED)
        public Client create(@RequestBody Client client){
            return clientService.save(client);
    }

    @PutMapping("clients/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Client update(@RequestBody Client client, @PathVariable Integer id){
        Client getCliient = clientService.findById(id);
        getCliient.setFirstName(client.getFirstName());
        getCliient.setSecondName(client.getSecondName());
        getCliient.setFirstSurname(client.getFirstSurname());
        getCliient.setSecondSurname(client.getSecondSurname());
        getCliient.setEmail(client.getEmail());
        getCliient.setAge(client.getAge());

         return clientService.save(getCliient);

    }

    @DeleteMapping("clients/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
        public void delete(@PathVariable Integer id){
            clientService.delete(id);

    }
}
