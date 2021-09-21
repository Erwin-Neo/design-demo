package com.kyle.design.factory.abstractfactory.calendar;

import java.util.List;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-16 21:25
 * @description :
 */
public class PacificCalendar extends Calendar {

    public PacificCalendar(com.kyle.design.factory.abstractfactory.calendar.ZoneFactory zoneFactory) {

       zone = zoneFactory.createZone("US/Pacific");
        // make a calendar for the pacific zone
        // ...
    }
    public void createCalendar(List<String> appointments) {
        // make calendar from appointments
        System.out.println("Making the calendar");
    }
}