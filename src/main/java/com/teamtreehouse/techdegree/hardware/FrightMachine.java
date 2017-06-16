package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.CameraAdapter;
import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.example.motion.MotionDetector;


public class FrightMachine extends MotionDetector {

    private final Horn horn;
    private final Strobe strobe;
    private final Camera camera;
    private final CameraAdapter cameraAdapter;

    public FrightMachine() {
        horn = new Horn();
        strobe = new Strobe();
        camera = new Camera();
        cameraAdapter = new CameraAdapter(camera);
        this.addObserver(cameraAdapter);
        this.addObserver(horn);
        this.addObserver(strobe);
    }

    @Override
    public void onMotionDetected() {
        setChanged();
        notifyObservers();
    }
}
