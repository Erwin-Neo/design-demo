package com.kyle.design.factory.abstractfactory.calendar;

import java.util.List;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-16 21:23
 * @description :
 */
public abstract class Calendar {

    com.kyle.design.factory.abstractfactory.calendar.Zone zone;

    public void print() {
        System.out.println("--- " + zone.getDisplayName() + " Calendar ---");
        // print all appointments in correct time zone
        System.out.println("Offset from GMT: " + zone.getOffset());
    }

    public abstract void createCalendar(List<String> appointments);

}
