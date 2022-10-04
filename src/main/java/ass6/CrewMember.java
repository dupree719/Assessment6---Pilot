package ass6;

public class CrewMember extends Person implements Servable, Payable{

   private float salary;
   FlightCrewJob job;

    public CrewMember(String name, float salary, FlightCrewJob job) {
        super(name);
        this.salary = salary;
        this.job = job;
    }

    @Override
    public String toString() {
        return "CrewMember{" +
                "Salary= " + salary +
                ", Job= " + job +
                '}';
    }


    @Override
    public String serve(Person person) {
        return "The" + job + " is now serving " + person.getName();

    }

    @Override
    public void printPaymentAmount() {

    }
}
