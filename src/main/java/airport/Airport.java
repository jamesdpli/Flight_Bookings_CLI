package airport;

import java.util.ArrayList;

public class Airport {

    private String name;
    ArrayList<Flight> flights;

    public Airport(String name){
        this.name = name;
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public void removeFlight(Flight flight){
        this.flights.remove(flight);
    }

    public ArrayList<Flight> getFlight(){
        return flights;
    }

    @Override
    public String toString() {
        return ", flights=" + flights +
                '}';
    }
}