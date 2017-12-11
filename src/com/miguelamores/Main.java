package com.miguelamores;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Predict predict = new Predict();
        Helper helper = new Helper();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the full plate number: ex. pef-0861");
        String num = scanner.next();

        System.out.println("Enter the day of week: ex. monday");
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(scanner.next().toUpperCase());

        System.out.println("Enter the time: ex. 08:30");
        LocalTime time = helper.parseStringToTime(scanner.next());

        boolean b = predict.calculate(num, dayOfWeek, time);

        if (b){
            System.out.println("WARNING!!! You have pico y placa");
        } else {
            System.out.println("You don't have pico y placa");
        }

    }
}
