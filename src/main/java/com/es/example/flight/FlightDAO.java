package com.es.example.flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FlightDAO extends JpaRepository<Flight, Long>, FlightCustomDAO {

}
