package com.example.motion;


import com.example.accessory.Accessory;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class MotionDetector extends Observable {


    public abstract void onMotionDetected();

    public void simulateMotion() {
        onMotionDetected();
    }
}
