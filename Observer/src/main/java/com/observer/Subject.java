package com.observer;

import java.beans.*;

public abstract class Subject extends Thread {
    int time = 0;
    PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public void addObserver(PropertyChangeListener listener) {
        pcs.addPropertyChangeListener("time", listener);
    }

    public void setTime(int value) {
        int oldValue = time;
        time = value;
        pcs.firePropertyChange("time", oldValue, value);
    }
}
