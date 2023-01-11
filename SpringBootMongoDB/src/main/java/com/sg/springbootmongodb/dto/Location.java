package com.sg.springbootmongodb.dto;

import java.util.Objects;

public class Location {
    private Address address;
    private Geo geo;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(address, location.address) && Objects.equals(geo, location.geo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, geo);
    }

    @Override
    public String toString() {
        return "Location{" +
                "address=" + address +
                ", geo=" + geo +
                '}';
    }
}
