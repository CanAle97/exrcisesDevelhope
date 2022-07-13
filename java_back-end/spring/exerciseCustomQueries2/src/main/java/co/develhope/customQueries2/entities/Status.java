package co.develhope.customQueries2.entities;

public enum Status {

    ON_TIME("ON_TIME"),
    DELAYED("DELAYED"),
    CANCELLED("CANCELLED");

    private String choice;

    Status(String choice) {
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }
}