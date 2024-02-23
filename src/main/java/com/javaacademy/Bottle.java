package com.javaacademy;

/**
 * Бутылка
 */
public class Bottle {
    private final double volume;
    private double nestedVolume;
    private final String cityProducer;

    public Bottle(double volume, String cityProducer) {
        this.volume = volume;
        this.cityProducer = cityProducer;
    }

    public void addLiquid(double liquidVolume) {
        if (liquidVolume > nestedVolume) {
            throw  new RuntimeException("Объем добавляемой жидкости больше чем объем бутылки");
        }
        double newNestedVolume = nestedVolume + liquidVolume;
        if (newNestedVolume > volume) {
            throw  new RuntimeException("Нет места в бутылки, все выливается!");
        }
        setNestedVolume(newNestedVolume);
    }

    public void setNestedVolume(double nestedVolume) {
        this.nestedVolume = nestedVolume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Bottle{" +
                "volume=" + volume +
                ", nestedVolume=" + nestedVolume +
                '}';
    }
}
