package com.netcracker.HW3.ch9.project2;

public class Clock {
    private String alarm=null;

    public String getHour() {
        String time = java.time.LocalTime.now().toString();
        return time.substring(0, time.indexOf(':'));
    }

    public String getMinute() {
        String time = java.time.LocalTime.now().toString();
        return time.substring(time.indexOf(':') + 1, time.lastIndexOf(':'));
    }

    public void setAlarm(String alarm) {
        this.alarm=alarm;
    }

    public String getTime() {
        if (alarm!=null && Integer.parseInt(getHour()) >= Integer.parseInt(alarm.substring(0, alarm.indexOf(':')))) {
            if (Integer.parseInt(getMinute()) >= Integer.parseInt(alarm.substring(alarm.indexOf(':') + 1, alarm.length()-1))) {
                alarm = null;
                return getHour() + ":" + getMinute() + " ALAAAAAARM!!!";
            }
        }
        return getHour() + ":" + getMinute();
    }
}
