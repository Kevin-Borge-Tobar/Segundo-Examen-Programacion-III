package com.borge.service.clients.service;

import com.borge.service.clients.entities.Appointment;
import com.borge.service.clients.repositories.AppointmentJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class ServiceAppointmentImpl  implements  IServiceAppointment{
    @Autowired
    private AppointmentJpa appointmentJpa;
    @Override
    public List<Appointment> findAll() {
        return appointmentJpa.findAll();
    }

    @Override
    public Appointment findById(Long idAppointment) {
        return appointmentJpa.findById(idAppointment).orElse(null);
    }
    @Override
    public Appointment save(Appointment appointment) {
        appointmentJpa.save(appointment);
        return appointment;
    }

    @Override
    public Appointment delete(Long idAppointment) {
        appointmentJpa.deleteAllById(Collections.singleton(idAppointment));

        return null;
    }
}
