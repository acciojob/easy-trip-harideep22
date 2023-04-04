package com.driver.service;

import com.driver.model.Airport;
import com.driver.model.City;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import com.driver.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Date;


public class AirportService {
    @Autowired
    AirportRepository airportRepository;

    public void addAirport(Airport airport) {
        airportRepository.addAirport(airport);
    }

    public String getLargestAirportName() {
        return airportRepository.getLargestAirportName();
    }

    public String addFlight( Flight flight) {
        return airportRepository.addFlight(flight);
    }
    public double getShortestDurationOfPossibleBetweenTwoCities( City fromCity, City toCity){

        return airportRepository.getShortestDurationOfPossibleBetweenTwoCities(fromCity,toCity);
    }
    public int getNumberOfPeopleOn( Date date, String airportName){
        return airportRepository.getNumberOfPeopleOn(date,airportName);
    }

    public String bookATicket(Integer flightId, Integer passengerId){
        return airportRepository.bookATicket(flightId,passengerId);
    }
    public String cancelATicket(Integer flightId, Integer passengerId){
        return airportRepository.cancelATicket(flightId,passengerId);
    }
    public int calculateFlightFare(Integer flightId){
        return airportRepository.calculateFlightFare(flightId);
    }
    public int countOfBookingsDoneByPassengerAllCombined(Integer passengerId){
        return airportRepository.countOfBookingsDoneByPassengerAllCombined(passengerId);
    }
    public String getAirportNameFromFlightId(Integer flightId){
        return airportRepository.getAirportNameFromFlightId(flightId);
    }
    public int calculateRevenueOfAFlight(Integer flightId){
        return airportRepository.calculateRevenueOfAFlight(flightId);
    }
    public String addPassenger(Passenger passenger){
        return airportRepository.addPassenger(passenger);
    }
}