package com.miguelamores;

import java.time.DayOfWeek;
import java.time.LocalTime;

/**
 * Created by miguelamores on 12/8/17.
 */
public class Predict {

    private final static LocalTime MORNING_START = LocalTime.of(7, 30);
    private final static LocalTime MORNING_FINAL = LocalTime.of(9, 30);
    private final static LocalTime AFTERNOON_START = LocalTime.of(16, 00);
    private final static LocalTime AFTERNOON_FINAL = LocalTime.of(19, 30);

    Helper helper = new Helper();

    public Predict() {
    }

    public boolean calculate(String plateNumber, DayOfWeek date, LocalTime time){

        int lastNumber = Integer.parseInt(helper.parsePlateNumber(plateNumber));

        if (time.isAfter(MORNING_START) && time.isBefore(MORNING_FINAL) ||
                time.isAfter(AFTERNOON_START) && time.isBefore(AFTERNOON_FINAL)) {
            if (date.equals(DayOfWeek.MONDAY) && (lastNumber == 1 || lastNumber == 2))
                return true;
            if (date.equals(DayOfWeek.TUESDAY) && (lastNumber == 3 || lastNumber == 4))
                return true;
            if (date.equals(DayOfWeek.WEDNESDAY) && (lastNumber == 5 || lastNumber == 6))
                return true;
            if (date.equals(DayOfWeek.THURSDAY) && (lastNumber == 7 || lastNumber == 8))
                return true;
            if (date.equals(DayOfWeek.FRIDAY) && (lastNumber == 9 || lastNumber == 0))
                return true;
            else
                return false;
        } else {
            return false;
        }

    }
}
