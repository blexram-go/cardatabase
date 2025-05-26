package com.blexram.cardatabase.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ownerid;

    private String firstName, lastName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Car> cars;

    public Owner() {}

    public Owner(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getOwnerid() {
        return ownerid;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
