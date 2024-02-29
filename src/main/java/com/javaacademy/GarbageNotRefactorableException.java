package com.javaacademy;

import lombok.experimental.StandardException;

@StandardException
public class GarbageNotRefactorableException extends Exception{

    public GarbageNotRefactorableException(String message, Throwable cause,
                                           boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
