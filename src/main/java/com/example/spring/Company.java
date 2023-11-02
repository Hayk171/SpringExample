package com.example.spring;

public class Company {
    private Human human;
    private Address address;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Company(Human human, Address address) {
        this.human = human;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "human=" + human +
                ", address=" + address +
                '}';
    }
}
