import java.util.Arrays;
import java.util.Scanner;

public class CLI {

    Airport airport;
    Flight flight;
    FlightList flightList;
    PassengerList passengerList;
    Passenger passenger;
    Scanner scanner;


    public CLI(){
        this.scanner = new Scanner(System.in);
        this.flightList = new FlightList();
        this.passengerList = new PassengerList();
        this.flight = new Flight("Pakistan","656");
    }

    public static void printHelp() {
        String instructions = "What wou like to do?" + System.lineSeparator() +
                "add-flight [destination id]" + System.lineSeparator() +
                "add-passenger [name phone-number id]" + System.lineSeparator() +
                "display-all-flights [yes]" + System.lineSeparator() +
                "book-passenger-to-flight [name phone-number id]" + System.lineSeparator() +
                "cancel-flight" + System.lineSeparator();
        // Remember to adjust the index numbers in the logic

        System.out.println(instructions);
    }

    public void start() {
        String userInput = scanner.nextLine();
        String[] inputWords = userInput.split(" ");
        System.out.println(Arrays.toString(inputWords));
        String command = inputWords[0];

        switch (command) {

            case "add-flight":
                flightList.addFlight(new Flight(inputWords[1], inputWords[2]));
                System.out.println("Your flight has been added!");
                break;

            case "add-passenger":
                passengerList.addPassenger(new Passenger(inputWords[1], inputWords[2], inputWords[3]));
                System.out.println("Your passenger has been added");
                break;

            case "display-all-flights":
                flightList.getFlight().forEach(System.out::println);
                break;

            case "book-passenger-to-flight":
                flight.addPassengerToFlight(new Passenger(inputWords[1],inputWords[2],inputWords[3]));
                System.out.println("You have added a new passenger to the flight");
                break;

            case "cancel-flight":
                System.out.println("Here are your flights, what one do you want to cancel? (Type 1-10)");
                flightList.getFlight().forEach(System.out::println);
                int usersCanceledFLight = scanner.nextInt();
                flightList.cancelFlight(usersCanceledFLight - 1);
                System.out.println("Here is the new list of flights: ");
                flightList.getFlight().forEach(System.out::println);
                break;
        }

    }

}