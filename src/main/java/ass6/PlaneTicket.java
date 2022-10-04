package ass6;

public class PlaneTicket extends Ticket {
    public PlaneTicket(int id, String origin, String destination, String seatNumber, double price) {
        super(id, origin, destination, seatNumber, price);
    }

    public boolean isFrequentFlyer() {
        return true;


    }

    @Override
    public void printPaymentAmount() {

    }
}
