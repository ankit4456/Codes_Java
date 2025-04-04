class FlightTicket {
    private String ticketNumber;
    private String passengerName;
    protected double baseFare;

    public FlightTicket(String ticketNumber, String passengerName, double baseFare) {
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.baseFare = baseFare;
    }

    public double calculateTotalFare() {
        return baseFare;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public double getBaseFare() {
        return baseFare;
    }
}

class EconomyTicket extends FlightTicket {
    public EconomyTicket(String ticketNumber, String passengerName, double baseFare) {
        super(ticketNumber, passengerName, baseFare);
    }

    @Override
    public double calculateTotalFare() {
        return baseFare * 0.9;
    }
}

class BusinessTicket extends FlightTicket {
    public BusinessTicket(String ticketNumber, String passengerName, double baseFare) {
        super(ticketNumber, passengerName, baseFare);
    }

    @Override
    public double calculateTotalFare() {
        return baseFare * 1.2;
    }
}

class FirstClassTicket extends FlightTicket {
    public FirstClassTicket(String ticketNumber, String passengerName, double baseFare) {
        super(ticketNumber, passengerName, baseFare);
    }

    @Override
    public double calculateTotalFare() {
        return baseFare * 1.5;
    }
}

public class flightbookingsystem {
    public static void main(String[] args) {
        EconomyTicket economy = new EconomyTicket("E123", "John Doe", 100.0);
        BusinessTicket business = new BusinessTicket("B456", "Jane Smith", 200.0);
        FirstClassTicket firstClass = new FirstClassTicket("F789", "Alice Johnson", 300.0);

        System.out.println("Economy Ticket Fare: " + economy.calculateTotalFare());
        System.out.println("Business Ticket Fare: " + business.calculateTotalFare());
        System.out.println("First Class Ticket Fare: " + firstClass.calculateTotalFare());
    }
}