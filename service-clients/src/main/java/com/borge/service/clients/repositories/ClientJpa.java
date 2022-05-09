package com.borge.service.clients.repositories;

import com.borge.service.clients.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClientJpa extends JpaRepository<Client, Integer> {
}
