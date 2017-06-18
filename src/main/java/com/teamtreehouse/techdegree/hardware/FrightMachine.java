package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.CameraAdapter;
import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.example.motion.MotionDetector;

import java.util.Observer;


public class FrightMachine extends MotionDetector {

    public FrightMachine() {}

    @Override
    public void onMotionDetected() {
        setChanged();
        notifyObservers();
    }

    public void addObservers(Observer observer) {
        this.addObserver(observer);
        super.observers.add(observer);
    }
}
