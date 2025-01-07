package com.example.trafic_management_api.Components;


import com.example.trafic_management_api.Entities.AlerteTrafic;
import com.example.trafic_management_api.Entities.Itineraire;
import com.example.trafic_management_api.Entities.Zone;
import com.example.trafic_management_api.Repositories.AlerteTraficRepository;
import com.example.trafic_management_api.Repositories.ItineraireRepository;
import com.example.trafic_management_api.Repositories.ZoneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TrafficManagerDataLoader {

    @Bean
    public CommandLineRunner loadTrafficData(ZoneRepository zoneRepository,
                                             ItineraireRepository itineraireRepository,
                                             AlerteTraficRepository alerteTraficRepository) {
        return args -> {
            // Create zones
            Zone zone1 = new Zone();
            zone1.setNom("Centre-ville");
            zone1.setLatitude(48.8566);
            zone1.setLongitude(2.3522);
            zone1.setNiveauCongestion(8);
            zoneRepository.save(zone1);

            Zone zone2 = new Zone();
            zone2.setNom("Quartier des affaires");
            zone2.setLatitude(48.8584);
            zone2.setLongitude(2.2945);
            zone2.setNiveauCongestion(5);
            zoneRepository.save(zone2);

            // Create itineraries
            Itineraire itineraire = new Itineraire();
            itineraire.setDepart(zone1);
            itineraire.setArrivee(zone2);
            itineraire.setTempsEstime(15);
            itineraireRepository.save(itineraire);

            // Create traffic alerts
            AlerteTrafic alerte1 = new AlerteTrafic();
            alerte1.setZone(zone1);
            alerte1.setDescription("Accident signalé au carrefour principal.");
            alerte1.setHeure(new Date());
            alerteTraficRepository.save(alerte1);

            AlerteTrafic alerte2 = new AlerteTrafic();
            alerte2.setZone(zone2);
            alerte2.setDescription("Travaux sur la route principale.");
            alerte2.setHeure(new Date());
            alerteTraficRepository.save(alerte2);
        };
    }
}