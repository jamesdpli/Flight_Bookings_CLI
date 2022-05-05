import airport.Flight;
import airport.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerList {

    public static final  List<Passenger> passengers = List.of(
      new Passenger ("Tom", "07923657892", 001),
      new Passenger ("Sam", "07923657456", 002),
      new Passenger ("Pat", "07923657654", 003),
      new Passenger ("James", "0792365773", 004),
      new Passenger ("Naim", "07923657987", 005),
      new Passenger ("Aisha", "07923657123", 006),
      new Passenger ("Henry", "07923657432", 007),
      new Passenger ("Harry", "07923657524", 020),
      new Passenger ("John", "07923657935", 030),
      new Passenger ("Ben", "07923657710", 010)
    );

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void removePassenger(Passenger passenger){
        this.passengers.remove(passenger);
    }


}
