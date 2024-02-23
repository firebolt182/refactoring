package com.javaacademy;

public class JournalRecord {
    private double garbageWeight;
    private Bottle bottle;
    private Cartoon cartoon;

    public JournalRecord(Bottle bottle) {
        this.bottle = bottle;
    }

    public JournalRecord(double garbageWeight) {
        this.garbageWeight = garbageWeight;
    }

    public JournalRecord(Cartoon cartoon) {
        this.cartoon = cartoon;
    }

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
