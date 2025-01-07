package com.example.trafic_management_api.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class AlerteTrafic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Zone zone;

    private String description;
    private Date heure;

}