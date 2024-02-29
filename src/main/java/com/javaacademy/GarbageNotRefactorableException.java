package com.javaacademy;

import lombok.Builder;

public class GarbageNotRefactorableException extends Exception {

    @Builder(builderMethodName = "garbageNotRefactorableExceptionBuilder")
    public GarbageNotRefactorableException(String message,
                                           Throwable cause,
                                           boolean enableSuppression,
                                           boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}