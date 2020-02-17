package com.es.example.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;

@Controller
public class FlightController {
    @Autowired
    FlightService flightService;

    public FlightController(FlightService flightService){

        this.flightService = flightService;
    }

    @GetMapping(value = "/flights", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Flight>> searchFlights(@RequestParam String from, @RequestParam String to, @RequestParam String departure, @RequestParam String arrival) throws Exception{
        ZoneId zone = ZoneId.of("Europe/Berlin");
        LocalDate ld1 = LocalDate.parse(departure);
        OffsetDateTime dep = ld1.atStartOfDay(zone).toOffsetDateTime();
        LocalDate ld2 = LocalDate.parse(arrival);
        OffsetDateTime arr = ld2.atStartOfDay(zone).toOffsetDateTime();
        List<Flight> flights = this.flightService.searchFlights(from, to, dep, arr);
        return new ResponseEntity<List<Flight>>(flights, HttpStatus.OK);

    }

}
