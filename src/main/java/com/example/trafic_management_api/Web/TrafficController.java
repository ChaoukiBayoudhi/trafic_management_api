package com.example.trafic_management_api.Web;

import com.example.trafic_management_api.Entities.Itineraire;
import com.example.trafic_management_api.Entities.Zone;
import com.example.trafic_management_api.Repositories.ItineraireRepository;
import com.example.trafic_management_api.Repositories.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class TrafficController {

    @Autowired
    private ZoneRepository zoneRepository;

    @Autowired
    private ItineraireRepository itineraireRepository;

    @GetMapping("/zones-congestionnees")
    public List<Zone> getZonesCongestionnees() {
        return zoneRepository.findAll();
    }

    @PostMapping("/itineraire-alternatif")
    public Itineraire createItineraireAlternatif(@RequestBody Itineraire itineraire) {
        return itineraireRepository.save(itineraire);
    }
}