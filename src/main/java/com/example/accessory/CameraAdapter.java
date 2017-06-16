package com.example.accessory;


import com.teamtreehouse.techdegree.hardware.Camera;

import java.util.Observable;
import java.util.Observer;

public class CameraAdapter implements CameraInterface, Observer {
    private Camera camera;


    public CameraAdapter(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void snapPhotos(int numberOfPhotos) {
        camera.snapPhotos(numberOfPhotos);
    }

    @Override
    public void update(Observable observable, Object o) {
        snapPhotos(5);
    }
}
