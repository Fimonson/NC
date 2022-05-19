package com.netcracker.HW3.ch9.project2;

public class main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        WorldClock worldClock1 = new WorldClock(2);
        WorldClock worldClock2 = new WorldClock(-2);
        System.out.println("My time "+clock.getTime());
        System.out.println("Time to Maldives "+worldClock1.getTime());
        System.out.println("Time to Spain "+worldClock2.getTime());
        clock.setAlarm("15:40");
        System.out.println("My time "+clock.getTime());
    }
}
