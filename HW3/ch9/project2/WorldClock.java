package com.netcracker.HW3.ch9.project2;

public class WorldClock extends Clock {
    private int timeOfSet;
    public WorldClock(int timeOfSet){
        this.timeOfSet=timeOfSet;
    }
    @Override
    public String getHour(){
        String time=java.time.LocalTime.now().toString();
        int resultTime=Integer.parseInt(time.substring(0,time.indexOf(':')));
        return Integer.toString(resultTime+timeOfSet);
    }
}
