package listManager;

import airport.Passenger;

import java.util.ArrayList;
import java.util.List;

public class PassengerList {

    List<Passenger> passengers;

    public PassengerList(){
        this.passengers = new ArrayList<>();
        passengers.add(new Passenger("Tom", "07923657892", "001"));
        passengers.add(new Passenger("Henry", "07923657654", "002"));
        passengers.add(new Passenger("James", "07923657123", "003"));
        passengers.add(new Passenger("Naim", "07923657935", "004"));
        passengers.add(new Passenger("Aisha", "07923657911", "005"));
        passengers.add(new Passenger("Edward", "07923657750", "006"));
        passengers.add(new Passenger("Harry", "07923657173", "007"));
        passengers.add(new Passenger("Sheldon", "07923657010", "010"));
        passengers.add(new Passenger("Penny", "07923657667", "020"));
        passengers.add(new Passenger("Raj", "07923657889", "030"));
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void removePassenger(int index){
        this.passengers.remove(index);
    }


}
