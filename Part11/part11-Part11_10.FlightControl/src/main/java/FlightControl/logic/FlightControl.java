/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author OS
 */
public class FlightControl {
    private HashMap<String, Airplane> airplanes = new HashMap<>();
    private HashMap<String, Flight> flights = new HashMap<>();
    private Map<String, Place> places = new HashMap<>();
    
    public FlightControl() {
        
    }
    
    public void addAirplane(String ID, int capacity) {
        Airplane newAirplane = new Airplane(ID, capacity);
        airplanes.put(ID, newAirplane);
    }
    
    public void addFlight(Airplane airplane, String departureAirport, String destinationAirport) {
        places.putIfAbsent(departureAirport, new Place(departureAirport));
        places.putIfAbsent(destinationAirport, new Place(destinationAirport));
        
        Flight newFlight = new Flight(airplane, places.get(departureAirport), places.get(destinationAirport));
        flights.put(newFlight.toString(), newFlight);
    }
    
    public Collection<Airplane> getAirplanes() {
        return airplanes.values();
        
    }
    
    public Collection<Flight> getFlights() {
        return flights.values();
    }
    
    public Airplane getAirplane(String ID) {
        return airplanes.get(ID);
    }
}
