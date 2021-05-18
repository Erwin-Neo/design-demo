package com.kyle.design.factory.abstractfactory.calendar;

import java.util.Arrays;
import java.util.List;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-16 21:32
 * @description :
 */
public class CalendarTestDrive {

    public static void main(String[] args) {
        com.kyle.design.factory.abstractfactory.calendar.ZoneFactory zoneFactory = new com.kyle.design.factory.abstractfactory.calendar.ZoneFactory();
        Calendar calendar = new com.kyle.design.factory.abstractfactory.calendar.PacificCalendar(zoneFactory);
        List<String> appts = Arrays.asList("appt 1", "appt 2");
        calendar.createCalendar(appts);
        calendar.print();
    }
}
