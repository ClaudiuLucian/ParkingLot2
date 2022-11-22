package com.parking.parkinglot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Car {
    private User owner;

    @ManyToOne
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
