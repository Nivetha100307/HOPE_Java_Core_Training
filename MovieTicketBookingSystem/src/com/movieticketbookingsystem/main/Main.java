package main;

import model.*;
import service.BookingService;
import exception.InvalidBookingException;

public class Main {
    public static void main(String[] args) {

        try {
            User user = new User("Nivetha", 19, "Female");
            Movie movie = new Movie("Leo", 150);
            Screen screen = new Screen("Screen 1", 100);
            Show show = new Show(movie, screen, "6 PM");

            BookingService service = new BookingService();

            Ticket ticket = service.bookTicket(user, show, 5);
            ticket.printTicket();

            System.out.println("Available seats after booking: " + show.getAvailableSeats());

            service.cancelTicket(ticket);

            ticket.printTicket();

            System.out.println("Available seats after cancellation: " + show.getAvailableSeats());

            service.cancelTicket(ticket);

        } catch (InvalidBookingException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}