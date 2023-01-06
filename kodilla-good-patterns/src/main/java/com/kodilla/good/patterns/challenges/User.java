package com.kodilla.good.patterns.challenges;

public class User {
    private  String username;
    private  String realName;
    private  String email;
    private Address address;

    public User(final String username, final String realName, final String email, final Address address) {
        this.username = username;
        this.realName = realName;
        this.email = email;
        this.address = address;
    }
    public User(final String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String getEmail() {
        return email;
    }

    public Address getAdres() {
        return address;
    }
}
