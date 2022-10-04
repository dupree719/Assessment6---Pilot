package ass6;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Plane
        PlaneTicket planeTicket = new PlaneTicket(1, "Newark, DE", "Venice, Italy", "23A", 100.0);
        String[] luggage1 = {"suitcase", "backpack", "duffel bag"};
        Passenger passenger07 = new Passenger("Zaye", planeTicket, 800.0, luggage1);
        System.out.println("Now printing passenger07's ticket: ");
        passenger07.printTicket();
        System.out.println("\n");

        //Bus
        BusTicket busTicket = new BusTicket(2, "San Francisco, CA", "Los Angeles, CA", "5", 50.0);
        String[] luggage2 = {"suitcase", "purse"};
        Passenger passenger57 = new Passenger("Lola", busTicket, 1000.0, luggage2);
        System.out.println("Now printing amount of luggage passenger57 is carrying: ");
        System.out.println(passenger57.getAmtOfLuggage());
        System.out.println("\n");


        //Flight Crew
        CrewMember crewMember1 = new CrewMember("Tommy", 100000.0f, FlightCrewJob.PILOT);
        CrewMember crewMember2 = new CrewMember("Franklin", 90000.0f, FlightCrewJob.CO_PILOT);
        CrewMember crewMember3 = new CrewMember("Maria", 70000.0f, FlightCrewJob.FLIGHT_ATTENDANT);
        System.out.println(crewMember3.serve(passenger57));
        System.out.println("\n");

        //List of Flight Crew Job titles
        List<FlightCrewJob> jobList = new ArrayList<>();
        jobList.add(FlightCrewJob.FLIGHT_ATTENDANT);
        jobList.add(FlightCrewJob.PILOT);
        jobList.add(FlightCrewJob.CO_PILOT);
        System.out.println("Now printing each Flight Crew Job Title: ");
        FlightApp.printEachFlightCrewJob((ArrayList<FlightCrewJob>) jobList);
        System.out.println("\n");


        //Sorting Crew by Job Titles
        System.out.println("Before sorting: ");
        for (FlightCrewJob jobs : jobList) {
            System.out.println(jobs);
        }
        System.out.println("\n");

            Comparator jobComparator = new JobComparator();
            Collections.sort(jobList);
        System.out.println("After sorting: ");
            for (FlightCrewJob jobs : jobList) {
                System.out.println(jobs);
            }
        System.out.println("\n");

        Payable [] payables = {busTicket, planeTicket, crewMember1, crewMember2, crewMember3};
        FlightApp.printAmountForEachThingThatIsPayable(payables);

        }









}

