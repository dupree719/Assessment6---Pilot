package ass6;
import java.util.*;


public class JobComparator implements Comparator<FlightCrewJob> {
    @Override
    public int compare(FlightCrewJob o1, FlightCrewJob o2) {
        return o1.compareTo(o2);

    }

}




