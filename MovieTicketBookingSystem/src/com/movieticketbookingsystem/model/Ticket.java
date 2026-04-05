package model;

public class Ticket {
    private Booking booking;
    private String status;

    public Ticket(Booking booking) {
        this.booking = booking;
        this.status = "CONFIRMED";
    }

    public String getStatus() {
        return status;
    }

    public Booking getBooking() {
        return booking;
    }

    public void cancel() {
        this.status = "CANCELLED";
    }

    public void printTicket() {
        System.out.println("===== TICKET =====");
        System.out.println("User: " + booking.getUser().getName());
        System.out.println("Movie: " + booking.getShow().getMovie().getTitle());
        System.out.println("Screen: " + booking.getShow().getScreen().getScreenName());
        System.out.println("Timing: " + booking.getShow().getTiming());
        System.out.println("Seats: " + booking.getSeats());
        System.out.println("Total Price: " + booking.getTotalPrice());
        System.out.println("Status: " + status);
        System.out.println("==================");
    }
}