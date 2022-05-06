package listManager;

import airport.Flight;
import listManager.FlightList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightListTest {

    FlightList flightList;

    @BeforeEach
    public void setup() {
        this.flightList = new FlightList();
    }

    @Test
    public void flightsAreAdded(){
        assertThat(flightList.getFlight().size()).isEqualTo(10);
    }


    @Test
    public void canAddFlight(){
        flightList.addFlight(new Flight("London", "432"));
        assertThat(flightList.getFlight().size()).isEqualTo(11);
    }


    @Test
    public void canCancelFlight(){
        flightList.cancelFlight(2);
        assertThat(flightList.getFlight().size()).isEqualTo(9);
    }
}