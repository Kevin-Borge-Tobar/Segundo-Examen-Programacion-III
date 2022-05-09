package com.borge.service.clients.service;
import com.borge.service.clients.entities.Appointment;
import java.util.List;

public interface IServiceAppointment {
    public List<Appointment> findAll();
    public  Appointment findById(Long idAppointment);
    public Appointment save(Appointment appointment);
    public Appointment delete(Long idAppointment);
}
