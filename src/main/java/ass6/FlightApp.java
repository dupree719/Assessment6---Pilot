package ass6;

import java.util.ArrayList;

public class FlightApp {
    public static void printEachFlightCrewJob(ArrayList<FlightCrewJob> jobList){
        for (int i = 0; i < jobList.size(); i++) {
            System.out.println(jobList.get(i));
        }
    }
    public static void printAmountForEachThingThatIsPayable(Payable[] payableList){
        for (int i = 0; i < payableList.length; i++) {
            System.out.println(payableList.length(i));
        }

    }
    public static void sortAndPrintCrewMembersByJob(ArrayList<FlightCrewJob> jobList){

    }
    public static void printAllJobsExceptThisCrewMemberJob(ArrayList<FlightCrewJob> CrewMemeber){

    }
}
