/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author OS
 */
public class Flight {
    private Airplane airplane;
    private Place departureAirport;
    private Place destinationAirport;
    
    public Flight(Airplane airplane, Place departureAirport, Place destinationAirport) {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
    }
    
    public Airplane getAirplane() {
        return airplane;
    }
    
    public Place getDeparture() {
        return departureAirport;
    }
    
    public Place getDestination() {
        return destinationAirport;
    }
    
    public String toString() {
        return airplane.toString() + " (" + departureAirport + "-" + destinationAirport + ")";
    }
    
    
    
}
