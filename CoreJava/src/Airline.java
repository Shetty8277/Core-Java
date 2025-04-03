public class Airline {

    String airlineName;
    String flightNumber;
    int capacity;
    String source;
    String destination;
    double ticketPrice;
    boolean international;
    int flightDuration;
    String aircraftType;
    int availableSeats;

    Airline() {
        System.out.println("default construtor");
    }

    Airline(String airlineName) {
        this();
        this.airlineName = airlineName;
    }

    Airline(String airlineName, String flightNumber, int capacity, String source) {
        this(airlineName);
        this.flightNumber = flightNumber;
        this.capacity = capacity;
        this.source = source;

    }

    Airline(String airlineName, String flightNumber, int capacity, String source, String destination, double ticketPrice, boolean international) {
        this(airlineName, flightNumber, capacity, source);
        this.destination = destination;
        this.ticketPrice = ticketPrice;
        this.international = international;
    }

    Airline(String airlineName, String flightNumber, int capacity, String source, String destination, double ticketPrice, boolean international, int flightDuration, String aircraftType, int availableSeats) {
        this(airlineName, flightNumber, capacity, source, destination, ticketPrice, international);
        this.flightDuration = flightDuration;
        this.aircraftType = aircraftType;
        this.availableSeats = availableSeats;
    }

    public void info() {
        System.out.println("Airline information");
        System.out.println("Airline Name is " + this.airlineName);
        System.out.println("Flight Number " + this.flightNumber);
        System.out.println("airoplane capacity " + this.capacity);
        System.out.println("airoplane source " + source);
        System.out.println("airoplane destination " + destination);
        System.out.println("Airline ticket price " + ticketPrice);
        System.out.println("The trip is international " + (international ? "Yes" : "No"));
        System.out.println("flight Duration " + flightDuration);
        System.out.println("Aircraft Type " + aircraftType);
        System.out.println("Airline available Seats " + availableSeats);
        System.out.println("-----------------------------------------------");

    }

    public static void main(String[] args) {
        Airline airline = new Airline("Air India", "101", 600, "Bengaluru", "America", 14500.25, true, 15, "Boeing", 250);
        airline.info();
        Airline airline1 = new Airline("harsha");
        airline1.info();

    }
}