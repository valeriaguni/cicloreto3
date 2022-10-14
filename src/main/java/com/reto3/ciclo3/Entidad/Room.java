package com.reto3.ciclo3.Entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "Room")
public class Room implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "hotel", nullable = false, length = 45)
    private String hotel;
    @Column(name = "stars", nullable = false, length = 4)
    private Integer stars;

    private String description;
    @ManyToOne
    @JoinColumn(name = "category")
    @JsonIgnoreProperties("rooms")
    private Category category;
    @OneToMany
    @JoinColumn(name = "room")
    @JsonIgnoreProperties({"room", "client"})
    private List<Message> messages;
    @OneToMany
    @JoinColumn(name = "room")
    @JsonIgnoreProperties({"room", "client"})
    private List<Reservation> reservations;
    public Room() {
    }

    public Room(Integer id, Integer stars, String name, String description, String hotel) {
        this.id = id;
        this.stars = stars;
        this.name = name;
        this.description = description;
        this.hotel = hotel;
    }

    public Room (Integer stars, String name, String description, String hotel) {
        this.stars = stars;
        this.name = name;
        this.description = description;
        this.hotel = hotel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }


}