package com.kyle.design.factory.abstractfactory.calendar;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @date : 2021-05-16 21:26
 * @description :
 */
public class ZoneFactory {

    public Zone createZone(String zoneId) {
        Zone zone = null;
        if (zoneId.equals("US/Pacific")) {
            zone = new ZonePacific();
        }
        else if (zoneId.equals("US/Mountain")) {
            zone = new ZoneMountain();
        }
        else if (zoneId.equals("US/Central")) {
            zone = new ZoneCentral();
        }
        else if (zoneId.equals("US/Eastern")) {
            zone = new ZoneEastern();
        }
        return zone;
    }
}