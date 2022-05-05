import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerListTest {

    PassengerList passengerList;

    @BeforeEach
    public void setUp(){
        passengerList = new PassengerList();
    }

    @Test
    public void passengersAreAdded(){
        assertThat(passengerList.getPassengers().size()).isEqualTo(10);
    }


    @Test
    public void canAddPassenger(){
        passengerList.addPassenger(new Passenger("Ben", "07956657892", "040"));
        assertThat(passengerList.getPassengers().size()).isEqualTo(11);
    }


    @Test
    public void canRemovePassenger(){
        passengerList.removePassenger(2);
        assertThat(passengerList.getPassengers().size()).isEqualTo(9);
    }
}
