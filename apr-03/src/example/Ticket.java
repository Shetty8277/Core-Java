package example;

public class Ticket {
    int ticketNo;
    String passengerName;
    String destination;


    public Ticket(int ticketNo, String passengerName, String destination) {
        this.ticketNo = ticketNo;
        this.passengerName = passengerName;
        this.destination = destination;
    }

    public void showTicket() {
        System.out.println(" Ticket No: " + ticketNo);
        System.out.println(" Passenger: " + passengerName);
        System.out.println(" Destination: " + destination);
        System.out.println("------------------------");
    }
}