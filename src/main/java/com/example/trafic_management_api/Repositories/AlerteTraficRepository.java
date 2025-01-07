package com.example.trafic_management_api.Repositories;

import com.example.trafic_management_api.Entities.AlerteTrafic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlerteTraficRepository extends JpaRepository<AlerteTrafic, Long> {}