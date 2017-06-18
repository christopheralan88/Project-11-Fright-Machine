package com.example.accessory;


import com.teamtreehouse.techdegree.hardware.Camera;

import java.util.Observable;
import java.util.Observer;

public class CameraAdapter implements Accessory {
    private Camera camera;


    public CameraAdapter(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void activate() {
        camera.snapPhotos(5);
    }
}
