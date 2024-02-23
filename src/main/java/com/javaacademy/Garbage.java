package com.javaacademy;

import java.util.Objects;

public class Garbage {
    private final GarbageType garbageType;
    private final double weight;
    private final String cityFrom;

    public Garbage(GarbageType garbageType, double weight, String cityFrom) {
        this.garbageType = garbageType;
        this.weight = weight;
        this.cityFrom = cityFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garbage garbage = (Garbage) o;
        return Double.compare(garbage.weight, weight) == 0 && Objects.equals(garbageType, garbage.garbageType)
                && Objects.equals(cityFrom, garbage.cityFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(garbageType, weight, cityFrom);
    }

    @Override
    public String toString() {
        return "Garbage{" +
                "garbageType=" + garbageType +
                ", weight=" + weight +
                ", cityFrom='" + cityFrom + '\'' +
                '}';
    }

    public GarbageType getGarbageType() {
        return garbageType;
    }

    public double getWeight() {
        return weight;
    }

    public String getCityFrom() {
        return cityFrom;
    }
}
