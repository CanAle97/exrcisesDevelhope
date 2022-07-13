package co.develhope.customQueries1.entities;

public enum Status {

    ONTIME("ON_TIME"),
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