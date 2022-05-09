package com.borge.service.clients.controllers;

import com.borge.service.clients.entities.Appointment;
import com.borge.service.clients.entities.Client;
import com.borge.service.clients.service.IServiceAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentRestController {

    private final IServiceAppointment serviceAppointment;

    @Autowired
    public AppointmentRestController(IServiceAppointment serviceAppointment) {
        this.serviceAppointment = serviceAppointment;
    }

    @GetMapping
    public List<Appointment> listAppointments(){
        return (List<Appointment>) serviceAppointment.findAll();
    }

    @GetMapping("/{idAppointment}")
    public Appointment view(@PathVariable Long idAppointment){
        return (Appointment) serviceAppointment.findById(idAppointment);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Appointment create(@RequestBody Appointment appointment){

        return serviceAppointment.save(appointment);
    }

    @PutMapping("/{idAppointment}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Appointment update(@RequestBody Appointment appointment, @PathVariable  Long idAppointment){
        Appointment getAppointment = serviceAppointment.findById(idAppointment);
        getAppointment.setIdPolicy(appointment.getIdPolicy());
        getAppointment.setStatus(appointment.getStatus());
        getAppointment.setObservations(appointment.getObservations());
        getAppointment.setAppointmentDate(appointment.getAppointmentDate());
         return serviceAppointment.save(getAppointment);

    }

    @DeleteMapping("/{idAppointment}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Appointment delete(@PathVariable Long idAppointment){
        return serviceAppointment.delete(idAppointment);
    }
}
