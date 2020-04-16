package com.second.task.time.domain;

import java.time.LocalTime;

public enum TimeUnitEnum {
    MILLISISECONS,
    SECOND,
    MINUTOS,
    HOURS;

    public static long fromTime(TimeUnitEnum unit, LocalTime date){
        int minute = date.getMinute();
        int second = date.getSecond();
        int hour = date.getHour();
        long secondTime= (hour * 60 + minute) * 60 + second;
        switch (unit){
            case HOURS:
                return hour;
            case MINUTOS:
                return hour * 60 + minute;
            case SECOND:
                return secondTime;
            case MILLISISECONS:
                return secondTime * 60;
            default:
                throw new UnsupportedOperationException();
        }
    }

}
