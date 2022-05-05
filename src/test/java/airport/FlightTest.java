package airport;

import airport.Flight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Passenger passenger;
    Flight flight;

    @BeforeEach
    public void setup() {
        this.passenger = new Passenger("Bob Marley", "07703645411", 123);
        this.flight = new Flight("Turkey", 321);
    }
/*
    @Test
    public void canAddPassenger() {
        //flight.addPassenger ("Bob Marley", "07703645411", 123);
        Passenger mike = new Passenger("Mike","07070707070",456);
        flight.addPassenger(mike);
        assertThat(flight.getPassengers().size()).isEqualTo(1);
    }
    */

}