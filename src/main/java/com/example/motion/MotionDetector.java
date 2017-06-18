package com.example.motion;


import com.example.accessory.Accessory;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class MotionDetector extends Observable {
    public List<Accessory> accessories = new ArrayList<>();

    public abstract void onMotionDetected();

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public void simulateMotion() {
        onMotionDetected();
    }
}
