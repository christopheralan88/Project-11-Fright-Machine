package com.teamtreehouse.techdegree.hardware;


import com.example.motion.MotionDetector;


public class FrightMachine extends MotionDetector {

    public FrightMachine() {}

    @Override
    public void onMotionDetected() {
        setChanged();
        notifyObservers();
    }

}
