package com.example.spring;

public class Human {

    private String name;
    private Integer age;
    private Address address;
    private HumanContact humanContact;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HumanContact getHumanContact() {
        return humanContact;
    }

    public void setHumanContact(HumanContact humanContact) {
        this.humanContact = humanContact;
    }

    public Human(String name, Integer age, Address address, HumanContact humanContact) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.humanContact = humanContact;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", humanContact=" + humanContact +
                '}';
    }
}
