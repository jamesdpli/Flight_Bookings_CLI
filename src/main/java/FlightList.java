import airport.Flight;

import java.util.List;

public class FlightList {

    public static final List<Flight> flights = List.of(
            new Flight("Turkey",1000),
            new Flight("Peru", 900),
            new Flight("Oman",800),
            new Flight("Mexico",700),
            new Flight("France",600),
            new Flight("Germany",500),
            new Flight("Italy",400),
            new Flight("Malta",300),
            new Flight("Iceland",200),
            new Flight("India",100)
    );

}
