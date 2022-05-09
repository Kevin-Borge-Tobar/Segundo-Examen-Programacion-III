package com.borge.service.clients.repositories;

import com.borge.service.clients.entities.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyJpa extends JpaRepository<Policy, Long> {
}
