package com.javaacademy;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * Картон
 */
@AllArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cartoon {
    double weight;
}