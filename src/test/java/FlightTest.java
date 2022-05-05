import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {

    Flight flight;

    @BeforeEach
    public void setUp(){
        this.flight = new Flight("Turkey", "986");
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassengerToFlight(new Passenger("John", "07943761277", "011"));
        assertThat(flight.passengerList.size()).isEqualTo(11);
    }

}
