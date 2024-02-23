package com.javaacademy;

/**
 * Город
 */
public class City {
    public final String name;
    public int peopleCount;

    public City(String name, Integer peopleCount) {
        if (name == null) {
            throw new NullPointerException("name is marked non-null, but is null");
        }
        this.name = name;
        this.peopleCount = peopleCount;
    }

    public Garbage[] createGarbage() {
        return new Garbage[] {
            new Garbage(GarbageType.GLASS, 1000, this.name),
            new Garbage(GarbageType.PAPER, 15000, this.name),
            new Garbage(GarbageType.MIXED, 200000, this.name),
        };
    }

    public String getName() {
        return name;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    //Внимание, только город выводится на экран
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
