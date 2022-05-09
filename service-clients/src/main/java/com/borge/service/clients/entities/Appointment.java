package com.borge.service.clients.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_appointment")
    private Long idAppointment;
    @Column(name="appointment_date")
    private String appointmentDate;
    @Column(name="id_policy")
    private Long idPolicy;
    private String status;
    private String observations;

}
