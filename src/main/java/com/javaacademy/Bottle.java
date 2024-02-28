package com.javaacademy;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * Бутылка
 */
@RequiredArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bottle {
    @NonNull
    @Getter
    final double volume;
    @Setter
    double nestedVolume;
    final String cityProducer;

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
}
