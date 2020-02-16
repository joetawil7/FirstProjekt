package com.es.example.flight;

import java.time.OffsetDateTime;
import java.util.List;

public interface FlightCustomDAO {

    public List<Flight> searchFlights(String from, String to, OffsetDateTime departure, OffsetDateTime arrival);
}
