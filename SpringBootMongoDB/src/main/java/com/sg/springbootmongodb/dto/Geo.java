package com.sg.springbootmongodb.dto;

import java.util.List;
import java.util.Objects;

public class Geo {
    private String type;
    private List<Integer> coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Integer> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Integer> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geo geo = (Geo) o;
        return Objects.equals(type, geo.type) && Objects.equals(coordinates, geo.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, coordinates);
    }

    @Override
    public String toString() {
        return "Geo{" +
                "type='" + type + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
