import java.util.ArrayList;

public class Airport {

    private String name;
    //ArrayList<Flight> flights;
    private ArrayList<Flight> flights;


    public Airport(String name){
        this.name = name;
        //this.flights = new ArrayList<>();
    }


    public ArrayList<Flight> getFlight(){
        return flights;
    }


}