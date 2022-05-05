import java.util.ArrayList;
import java.util.List;

public class Flight {

    private String destination;
    private int id;
    List<Passenger> passengerList;

    public Flight(String destination, int id){
        this. destination = destination;
        this.id = id;
        this.passengerList = new PassengerList().getPassengers();
    }

//  Getters and Setters

    public void addPassengerToFlight(Passenger passenger){
        this.passengerList.add(passenger);
    }

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
