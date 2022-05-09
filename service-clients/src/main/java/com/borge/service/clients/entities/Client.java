package com.borge.service.clients.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
@Table(name = "clients")

public class Client implements Serializable{
	private static final long serialVersionUID = 957356166625407561L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "first_surname")
    private String firstSurname;
    @Column(name="second_surname")
    private String secondSurname;
    private String email;
    private String age;
    @Column(name = "create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;

    //se dice que antes de persistir se le asigna la fecha de creacion desde el pojo
   // @PrePersist
  //  public void prePersist(){
       // this.createAt = new Date();
    }


