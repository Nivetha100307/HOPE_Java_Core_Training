package model;

public class Show {
    private Movie movie;
    private Screen screen;
    private String timing;
    private int availableSeats;

    public Show(Movie movie, Screen screen, String timing) {
        this.movie = movie;
        this.screen = screen;
        this.timing = timing;
        this.availableSeats = screen.getTotalSeats();
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeats(int seats) {
        this.availableSeats -= seats;
    }

    public void cancelSeats(int seats) {
        this.availableSeats += seats;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public String getTiming() {
        return timing;
    }
}