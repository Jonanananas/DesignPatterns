package com.prototype;

public class Clock implements Cloneable {
    private Pointer hourHand, minuteHand;
    private String name;

    public String getTime() {
        return hourHand.getTime() + ":" + minuteHand.getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHour(int time) {
        hourHand.setTime(time);
    }

    public void setMinute(int time) {
        minuteHand.setTime(time);
    }

    public Clock(int hour, int minute, String name) {
        hourHand = new Pointer(hour);
        minuteHand = new Pointer(minute);
        this.name = name;
    }

    public Clock clone() {
        // deep copy
        Clock c = null;
        try {
            c = (Clock) super.clone();
            c.hourHand = (Pointer) hourHand.clone();
            c.minuteHand = (Pointer) minuteHand.clone();
        } catch (CloneNotSupportedException e) {
        }
        return c;
    }

    // public Object clone() {
    // // shallow copy:
    // try {
    // return super.clone();
    // } catch (CloneNotSupportedException e) {
    // return null;
    // }
    // }
}