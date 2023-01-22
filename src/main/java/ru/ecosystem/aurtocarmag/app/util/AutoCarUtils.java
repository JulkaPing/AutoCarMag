package ru.ecosystem.aurtocarmag.app.util;

import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class AutoCarUtils {
    public String USER_ID_KEY = "USER_ID";
    public long generateId() {
        return Math.abs(new Random().nextLong());
    }
}
