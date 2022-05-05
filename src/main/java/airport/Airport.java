package airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private String name;
    //ArrayList<Flight> flights;
    private List<Flight> flights;


    public Airport(String name){
        this.name = name;
        //this.flights = new ArrayList<>();
    }


    public List<Flight> getFlight(){
        return FlightList.flights;
    }


}