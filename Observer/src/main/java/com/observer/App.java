package com.observer;

public class App {
    public static void main(String[] args) {
        ClockTimer clockTimer = new ClockTimer();

        DigitalClock digital1 = new DigitalClock(clockTimer);
        DigitalClock digital2 = new DigitalClock(clockTimer);

        clockTimer.start();
    }
}
