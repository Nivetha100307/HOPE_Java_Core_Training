package service;


import model.*;

import model.Show;
import model.Ticket;
import model.User;

import exception.InvalidBookingException;

public class BookingService {

    public Ticket bookTicket(User user, Show show, int seats) throws InvalidBookingException {

        // Validation
        if (seats <= 0) {
            throw new InvalidBookingException("Seats must be greater than 0");
        }

        if (seats > show.getAvailableSeats()) {
            throw new InvalidBookingException("Not enough seats available");
        }

        // Process booking
        show.bookSeats(seats);

        Booking booking = new Booking(user, show, seats);

        return new Ticket(booking);
    }

    public void cancelTicket(Ticket ticket) throws InvalidBookingException {

        if (ticket == null) {
            throw new InvalidBookingException("Invalid ticket");
        }

        if (ticket.getStatus().equals("CANCELLED")) {
            throw new InvalidBookingException("Ticket already cancelled");
        }

        Booking booking = ticket.getBooking();
        Show show = booking.getShow();

        // Restore seats
        show.cancelSeats(booking.getSeats());

        // Update status
        ticket.cancel();

        System.out.println("Ticket cancelled successfully. Refund: " + booking.getTotalPrice());
    }
}