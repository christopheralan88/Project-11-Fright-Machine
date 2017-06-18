package com.example.accessory;


import com.teamtreehouse.techdegree.hardware.Camera;

import java.util.Observable;
import java.util.Observer;

public class CameraAdapter implements Observer, Accessory {
    private Camera camera;


    public CameraAdapter(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void update(Observable observable, Object o) {
        camera.snapPhotos(5);
    }

    @Override
    public void activate() {
        camera.snapPhotos(5);
    }
}
