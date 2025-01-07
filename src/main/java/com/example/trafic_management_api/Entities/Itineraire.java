package com.example.trafic_management_api.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Itineraire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Zone depart;

    @ManyToOne
    private Zone arrivee;

    private int tempsEstime;

}