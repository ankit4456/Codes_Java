class MovieTicket {
    String ticketId;
    String movieName;
    double basePrice;

    MovieTicket(String ticketId, String movieName, double basePrice) {
        this.ticketId = ticketId;
        this.movieName = movieName;
        this.basePrice = basePrice;
    }

    double calculateFinalPrice() {
        return basePrice;
    }
}

class StandardTicket extends MovieTicket {
    StandardTicket(String ticketId, String movieName, double basePrice) {
        super(ticketId, movieName, basePrice);
    }

    @Override
    double calculateFinalPrice() {
        return basePrice;
    }
}

class PremiumTicket extends MovieTicket {
    PremiumTicket(String ticketId, String movieName, double basePrice) {
        super(ticketId, movieName, basePrice);
    }

    @Override
    double calculateFinalPrice() {
        return basePrice + (basePrice * 0.25);
    }
}

class VIPTicket extends MovieTicket {
    VIPTicket(String ticketId, String movieName, double basePrice) {
        super(ticketId, movieName, basePrice);
    }

    @Override
    double calculateFinalPrice() {
        return basePrice + (basePrice * 0.50);
    }
}

public class movieticketbooking {
    public static void main(String[] args) {
        MovieTicket standardTicket = new StandardTicket("ST001", "Avengers", 200.0);
        MovieTicket premiumTicket = new PremiumTicket("PT001", "Avengers", 200.0);
        MovieTicket vipTicket = new VIPTicket("VT001", "Avengers", 200.0);

        System.out.println("Standard Ticket Final Price: " + standardTicket.calculateFinalPrice());
        System.out.println("Premium Ticket Final Price: " + premiumTicket.calculateFinalPrice());
        System.out.println("VIP Ticket Final Price: " + vipTicket.calculateFinalPrice());
    }
}
