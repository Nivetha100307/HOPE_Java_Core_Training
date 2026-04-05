package model;

public class Booking {
    private User user;
    private Show show;
    private int seats;
    private double totalPrice;

    public Booking(User user, Show show, int seats) {
        this.user = user;
        this.show = show;
        this.seats = seats;
        this.totalPrice = calculatePrice();
    }

    private double calculatePrice() {
        return seats * 150; 
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public User getUser() {
        return user;
    }

    public Show getShow() {
        return show;
    }

    public int getSeats() {
        return seats;
    }
}