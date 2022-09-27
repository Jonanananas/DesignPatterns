package com.observer;

import java.time.LocalTime;

public class ClockTimer extends Subject {
    private int time;

    public int getHour() {
        return time / 3600;
    }

    public int getMinute() {
        return (time % 3600) / 60;
    }

    public int getSecond() {
        return (time % 60) % 60;
    }

    void tick() {
        time++;
        if (time == 86400) {
            time = 0;
        }
        setTime(time);
    }

    @Override
    public void run() {
        int timeValue = LocalTime.now().getNano();
        int delay = 0;

        while (true) {
            if (LocalTime.now().getNano() != timeValue) {
                delay++;
                if (delay == 5000000) {
                    tick();
                    delay = 0;
                }
            }
        }
    }
}
