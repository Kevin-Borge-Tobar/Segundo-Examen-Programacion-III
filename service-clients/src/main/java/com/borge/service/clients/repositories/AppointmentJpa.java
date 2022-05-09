package com.borge.service.clients.repositories;

import com.borge.service.clients.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentJpa  extends JpaRepository<Appointment,Long> {
}
