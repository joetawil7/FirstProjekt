package com.es.example.flight;


import com.querydsl.jpa.impl.JPAQuery;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.OffsetDateTime;
import java.util.List;

public class FlightCustomDAOImpl implements FlightCustomDAO {
    @PersistenceContext
    private EntityManager entityManager;

   // @Query("SELECT * FROM com.es.example.flight.Flight f WHERE f.from = ?1 and f.to = ?2 and f.departure = ?3 and f.arrival = ?4")
    @Override
    public List<Flight> searchFlights(String from, String to, OffsetDateTime departure, OffsetDateTime arrival) {
        JPAQuery<Flight> query = new JPAQuery<Flight>();
        QFlight flight = new QFlight("flight");

        query.select(flight.to).from(flight);
             //   .where(flight.from.eq(from)
             //           .and(flight.to.eq(to)));
                 //       .and(flight.departure.eq(departure))
                  //      .and(flight.arrival.eq(arrival)));

        return query.fetch();

    }
}
