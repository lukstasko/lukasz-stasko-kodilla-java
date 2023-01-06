package com.kodilla.good.patterns.challenges;

public class Address {
    private String city;
    private String postCode;
    private String street;
    private String houseNumber;

    public Address(final String city, final String postCode, final String street, final String houseNumber) {
        this.city = city;
        this.postCode = postCode;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }
}
