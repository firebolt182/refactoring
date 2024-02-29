package com.javaacademy;

import lombok.*;
import lombok.experimental.NonFinal;

@Value
@NonFinal
public class Garbage {
    GarbageType garbageType;
    double weight;
    String cityFrom;
}