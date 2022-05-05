import java.util.ArrayList;
import java.util.List;

public class Flight {

    private String destination;
    private String id;
    List<Passenger> passengerList;

    public Flight(String destination, String id){
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "destination='" + destination + '\'' +
                ", id='" + id + '\'' +
                ", passengerList=" + passengerList +
                '}';
    }
}
