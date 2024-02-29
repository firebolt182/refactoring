package com.javaacademy;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Getter
public enum GarbageType {
    PAPER("Бумага"), GLASS("Стекло"), MIXED("Смешанный мусор");
    @NonNull
    String value;
}