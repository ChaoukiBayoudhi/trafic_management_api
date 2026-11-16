# Traffic management API

A REST API built with Spring Boot around 3 JPA entities, using PostgreSQL.

## Tech stack

- Java 23, built with Maven
- Spring Boot 3.4.1
- Spring Web (REST controllers)
- Spring Data JPA (Hibernate)
- Spring Data REST
- Lombok
- PostgreSQL driver
- Database: PostgreSQL (`trafficdb` in `application.properties`)

## Data model

| Entity | Fields |
|---|---|
| `Zone` | id, nom, latitude, longitude, niveauCongestion |
| `AlerteTrafic` | id, zone, description, heure |
| `Itineraire` | id, depart, arrivee, tempsEstime |

## REST endpoints

Found in the controllers (`TrafficController`):

| Method | Path |
|---|---|
| GET | `/api/zones-congestionnees` |
| POST | `/api/itineraire-alternatif` |

## Project structure

- `com.example.trafic_management_api`: TraficManagementApiApplication
- `com.example.trafic_management_api.Components`: TrafficManagerDataLoader
- `com.example.trafic_management_api.Entities`: AlerteTrafic, Itineraire, Zone
- `com.example.trafic_management_api.Repositories`: AlerteTraficRepository, ItineraireRepository, ZoneRepository
- `com.example.trafic_management_api.Web`: TrafficController
- Tests: 1 test class

## How to run

Requirements: a JDK 23+ and Maven (or the included Maven wrapper).
Create the `trafficdb` database and set your own username and password in `src/main/resources/application.properties`.

```bash
./mvnw spring-boot:run
```

The API then listens on `http://localhost:9995`.

---

Author: [Chaouki Bayoudhi](https://github.com/ChaoukiBayoudhi)
