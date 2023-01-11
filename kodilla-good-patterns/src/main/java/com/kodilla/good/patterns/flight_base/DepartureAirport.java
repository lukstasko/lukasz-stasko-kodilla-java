package com.kodilla.good.patterns.flight_base;

import java.util.Objects;

public class DepartureAirport {
    private String departureAirport;

    public DepartureAirport(final String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DepartureAirport that)) return false;
        return Objects.equals(getDepartureAirport(), that.getDepartureAirport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDepartureAirport());
    }
}
