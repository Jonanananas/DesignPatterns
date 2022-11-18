package com.prototype;

public class App {
    public static void main(String[] args) {
        System.out.println("Create a clock");
        Clock s = new Clock(1, 30, "clock1");
        System.out.println(s.getName() + " time = " + s.getTime());
        System.out.println("Clone the clock");
        Clock s2 = (Clock) s.clone();
        System.out.println(s2.getName() + " time = " + s2.getTime());
        System.out.println("Change the clone's name and time");
        s2.setHour(2);
        s2.setMinute(45);
        s2.setName("clock2");
        System.out.println(s.getName() + " time = " + s.getTime());
        System.out.println(s2.getName() + " time = " + s2.getTime());
        System.out.println("Change " + s.getName() + "'s time");
        s.setHour(9);
        s.setMinute(55);
        System.out.println(s.getName() + " time = " + s.getTime());
        System.out.println(s2.getName() + " time = " + s2.getTime());
    }
}
