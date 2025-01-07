package com.example.trafic_management_api.Repositories;
import com.example.trafic_management_api.Entities.Itineraire;
import com.example.trafic_management_api.Entities.Zone;
import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ItineraireRepository extends JpaRepository<Itineraire, Long> {}