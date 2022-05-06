package listManager;

import airport.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    //listManager.FlightList flightList;
    List<Flight> flights;

    public FlightList(){
        this.flights = new ArrayList<>();
        flights.add(new Flight("Turkey","1000"));
        flights.add(new Flight("Peru","900"));
        flights.add(new Flight("Oman","800"));
        flights.add(new Flight("Mexico","700"));
        flights.add(new Flight("France","600"));
        flights.add(new Flight("Germany","500"));
        flights.add(new Flight("Italy","400"));
        flights.add(new Flight("Malta","300"));
        flights.add(new Flight("Iceland","200"));
        flights.add(new Flight("India","100"));
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public void cancelFlight(int index){
        this.flights.remove(index);
    }

    public List<Flight> getFlight(){
        return flights;
    }


}
