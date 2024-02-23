package com.javaacademy;

public enum GarbageType {
    PAPER("Бумага"), GLASS("Стекло"), MIXED("Смешанный мусор");
    private final String value;

    GarbageType(String value) {
        if (value == null) {
            throw new NullPointerException("value is marked non-null, but is null");
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
