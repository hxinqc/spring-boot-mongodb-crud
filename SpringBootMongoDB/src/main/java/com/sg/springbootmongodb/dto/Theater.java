package com.sg.springbootmongodb.dto;

import java.util.Objects;

public class Theater {
    private String id;
    private Location location;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Theater theater = (Theater) o;
        return Objects.equals(id, theater.id) && Objects.equals(location, theater.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "id='" + id + '\'' +
                ", location=" + location +
                '}';
    }
}
