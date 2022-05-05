package airport;

import java.util.ArrayList;

public class Flight {

    private String destination;
    private int id;
    //ArrayList<Passenger> passengers;

    public Flight(String destination, int id){
        this. destination = destination;
        this.id = id;
        //this.passengers = new ArrayList<>();
    }

//  Getters and Setters


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "destination='" + destination + '\'' +
                ", id=" + id +
//               ", passengers=" + passengers +
                '}';
    }
}
