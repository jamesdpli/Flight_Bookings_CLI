package airport;

import airport.Airport;
import airport.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirportTest {

    Airport airport;

    @BeforeEach
    public void setUp(){
        this.airport = new Airport("Heathrow");
    }
/*
    @Test
    public void canAddFlight(){
        Flight plane1 = new Flight("Canada", 456);
        airport.addFlight(plane1);
        assertThat(airport.getFlight().size()).isEqualTo(1);
    }

 */

}