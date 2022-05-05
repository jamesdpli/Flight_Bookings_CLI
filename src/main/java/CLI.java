import java.util.Scanner;

public class CLI {

    Airport airport;
    Flight flight;
    static FlightList flightList;
    static PassengerList passengerList;
    Passenger passenger;
    static Scanner scanner;


    public static void printHelp() {
        String instructions = "What wou like to do?" + System.lineSeparator() +
                "add-flight [destination id]" + System.lineSeparator() +
                "add-passenger [name phone-number id]" + System.lineSeparator() +
                "display-all-flights [yes]" + System.lineSeparator() +
                "book-passenger-to-flight [name phone-number id]" + System.lineSeparator() +
                "cancel-flight [flight-number]" + System.lineSeparator();
                // Remember to adjust the index numbers in the logic

        System.out.println(instructions);
    }

    public static void start() {

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] inputWords = userInput.split("");

        var command = inputWords[0];
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
                for (int i=0; i<flightList.getFlight().size(); i++) {
                    System.out.println(flightList.getFlight());

                }
                break;

            case "book-passenger-to-flight":

                break;

            case "cancel-flight":

        }



    }




//    public  static String promtUser(String message) {
//
//        String input = promtUser("Welcome, what would you like to do?");
//        String[] inputWords = input.split("");
//
//        if (message == null) message = "What are your instructions?";
//
//        System.out.println(message);
//        String input = scanner.nextLine();
//        return input;
//          }











}


