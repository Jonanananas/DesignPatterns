package com.observer;

import java.beans.*;

public class DigitalClock implements PropertyChangeListener {
    private static int amountOfClocks;
    private ClockTimer timer;
    private int clockNumber;

    public DigitalClock(ClockTimer ct) {
        timer = ct;
        timer.addObserver(this);
        clockNumber = ++amountOfClocks;
    }

    public void printTime() {
        int hour = timer.getHour();
        int minute = timer.getMinute();
        int second = timer.getSecond();
        System.out.println("The clock " + clockNumber + " is now: " + hour + ":" + minute + ":" + second);
    };

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        printTime();
    }
}