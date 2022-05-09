package com.borge.service.clients.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "policy")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_policy")
    private   Long idPolicy;
    @Column(name = "id_client")
    private Integer idClient;
    private String status;
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "ending_date")
    @Temporal(TemporalType.DATE)
    private Date endingDate;



}
