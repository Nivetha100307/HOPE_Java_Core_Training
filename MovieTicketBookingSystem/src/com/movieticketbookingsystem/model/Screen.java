package model;

public class Screen {
    private String screenName;
    private int totalSeats;

    public Screen(String screenName, int totalSeats) {
        this.screenName = screenName;
        this.totalSeats = totalSeats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public String getScreenName() {
        return screenName;
    }
}