package co.develhope.customQueries2.entities;

import javax.persistence.*;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "description")
    private String description;
    @Column(name = "from_airport")
    private String fromAirport;
    @Column(name = "to_airport")
    private String toAirport;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    public Flight() {
    }

    public Flight(Long id, String description, String fromAirport, String toAirport, Status status) {
        this.id = id;
        this.description = description;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public String getToAirport() {
        return toAirport;
    }

    public void setToAirport(String toAirport) {
        this.toAirport = toAirport;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}