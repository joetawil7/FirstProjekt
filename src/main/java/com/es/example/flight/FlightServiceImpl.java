package com.es.example.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    FlightDAO flightDAO;

    public FlightServiceImpl(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    @Override
    public List<Flight> searchFlights(String from, String to, OffsetDateTime departure, OffsetDateTime arrival) {
        return  this.flightDAO.searchFlights(from,to,departure,arrival);
    }

}
