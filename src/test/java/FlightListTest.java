import airport.Flight;

import airport.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightListTest {

    Passenger passenger;
    Flight flight;
    FlightList flightList;

    @BeforeEach
    public void setup() {
        this.passenger = new Passenger("Bob Marley", "07703645411", 123);
        this.flight = new Flight("Turkey", 321);
        this.flightList = new FlightList();
    }
/*
    @Test
    public void canAddPassenger() {
        flightList.addPassenger ("Bob Marley", "07703645411", 123);
        Passenger mike = new Passenger("Mike","07070707070",456);
        flight.addPassenger(mike);
        assertThat(flight.getPassengers().size()).isEqualTo(1);
    }

 */


    /*
    @Test
    public void canAddFlights(){
        flightList.addFlight("Sudan", 987);
    }

     */


}