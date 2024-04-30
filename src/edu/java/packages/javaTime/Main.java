package edu.java.packages.javaTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.lengthOfYear());
        String year = localDate.toString();
        System.out.println(year);
        System.out.println(year.equals(localDate));



        }
    }






