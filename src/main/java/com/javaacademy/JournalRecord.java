package com.javaacademy;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.experimental.FieldDefaults;

@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class JournalRecord {
    double garbageWeight;
    Bottle bottle;
    Cartoon cartoon;

    @Override
    public String toString() {
        if (bottle != null) {
            return "Переработан стеклянный мусор, получились бутылки объема " + bottle.getVolume() + " мл\n";
        } else if (cartoon != null) {
            return "Переработан бумажный мусор, получилось " + cartoon.getWeight() + " кг картона\n";
        }
        return "Не переработано: " + garbageWeight + " килограмм смешанного мусора\n";
    }
}
