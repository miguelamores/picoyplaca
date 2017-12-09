package com.miguelamores;

import java.time.LocalTime;

/**
 * Created by miguelamores on 12/8/17.
 */
public class Helper {

    String regex = "\\d+";
    String regex2 = "[a-zA-Z]";

    public String parsePlateNumber(String fullPlateNumber){
        String number = fullPlateNumber.substring(4,8);
        if (fullPlateNumber.length() == 8
                && number.matches(regex)){
            //System.out.println(fullPlateNumber.substring(0,2));
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
