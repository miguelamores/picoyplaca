package com.miguelamores;

import java.time.LocalTime;

/**
 * Created by miguelamores on 12/8/17.
 */
public class Helper {

    public String parsePlateNumber(String fullPlateNumber){
        if (fullPlateNumber.length() == 7 || fullPlateNumber.length() == 8){
            String num = fullPlateNumber.substring(fullPlateNumber.length() - 1);
            return num;
        }
        throw new NumberFormatException();

    }

    public LocalTime parseStringToTime(String time){
        if (time.length() == 5){
            return LocalTime.parse(time);
        }
        throw new NumberFormatException();

    }
}
