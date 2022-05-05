import airport.Airport;
import airport.Flight;
import airport.Passenger;

import java.util.Locale;
import java.util.Scanner;

public class App {

    Airport airport;
    Flight flight;
    Passenger passenger;
    Scanner scanner;
    private boolean booked;

    public App(){
        this.scanner = new Scanner(System.in);
        this.airport = new Airport("Heathrow");
    }

    public void start(){

        System.out.println("What is your name? ");

        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + " welcome to our Command Line Interface Project :)!");

//        this.booked = false;
//
//        while(!booked){
//            promptUser();
//
//
//        }
    }

//    public void promptUser(){
//        System.out.println("Do you want to book a flight? (yes/no)");
//        boolean booked = scanner.nextBoolean();
//        if(booked == true){
//            System.out.println("");
//        }
//
//    }

    public void userAddFlight() {
        System.out.println("Do you want to add a flight? (yes/no)");

        String userChoice1 = scanner.nextLine();

                if("yes".equals(userChoice1.toLowerCase())){

            System.out.println("Please enter the flight destination: ");
            String userFlightDestination = scanner.nextLine();
            System.out.println("Please enter the flight id: ");
            int userFlightId = scanner.nextInt();

            Flight newFlight = new Flight(userFlightDestination,userFlightId);
            airport.addFlight(newFlight);

            System.out.println("The flight added is: " + newFlight);

        } else if("no".equals(userChoice1.toLowerCase())){
            System.out.println("Okay...");

        } else {
            System.out.println("You have not entered 'yes' or 'no'");
        }
    }
     public void userDisplayAllFlights(){
         System.out.println("Do you want to see all of our flights? (yes/no)");

         String userChoice2 = scanner.nextLine();

         if("yes".equals(userChoice2.toLowerCase())) {

             for (Flight flights: FlightList.flights) {
                 System.out.println(FlightList.getFlight());

             }

         }

     }










}
