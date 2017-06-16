package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.CameraAdapter;
import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.example.motion.MotionDetector;

import java.util.Observable;

public class FrightMachine extends MotionDetector {

    private final Horn horn; //accessory
    private final Strobe strobe; //accessory
    private final Camera camera; //hardware
    private final CameraAdapter cameraAdapter;  //TODO: CJ TEST

    public FrightMachine() {
        horn = new Horn();
        strobe = new Strobe();
        camera = new Camera();
        cameraAdapter = new CameraAdapter(camera);  //TODO: CJ TEST
        this.addObserver(cameraAdapter);  //TODO: CJ TEST
        this.addObserver(horn);
        this.addObserver(strobe);
    }

    @Override
    public void onMotionDetected() {
        // TODO: This is hardcoded, we should make it more extensible!  :(
        setChanged();
        notifyObservers();

        //horn.activate();
        //strobe.activate();
        //camera.snapPhotos(5);
    }
}
