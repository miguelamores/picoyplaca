package com.miguelamores;

import java.time.LocalTime;

/**
 * Created by miguelamores on 12/8/17.
 */
public class Helper {

    public String parsePlateNumber(String fullPlateNumber){
        String num = fullPlateNumber.substring(fullPlateNumber.length() - 1);
        return num;
    }

    public LocalTime parseStringToTime(String time){
        return LocalTime.parse(time);
    }
}
