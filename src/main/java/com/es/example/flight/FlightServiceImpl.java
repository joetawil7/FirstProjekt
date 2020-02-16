package com.es.example.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Flight> findAll() {
        return null;
    }

    @Override
    public List<Flight> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Flight> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Flight> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Flight flight) {

    }

    @Override
    public void deleteAll(Iterable<? extends Flight> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Flight> S save(S s) {
        return null;
    }

    @Override
    public <S extends Flight> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Flight> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Flight> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Flight> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Flight getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Flight> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Flight> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Flight> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Flight> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Flight> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Flight> boolean exists(Example<S> example) {
        return false;
    }
}
