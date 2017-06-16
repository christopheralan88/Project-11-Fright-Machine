package com.teamtreehouse.techdegree.hardware;

import java.util.Observable;
import java.util.Observer;

public class Camera implements Observer {

    public void snapPhotos(int numberOfPhotos) {
        for (int i = 0; i < numberOfPhotos; i++) {
            System.out.println("SNAP:  Photo #" + (i + 1) + " taken");
        }
    }

    @Override
    public void update(Observable observable, Object o) {
        snapPhotos(5);
    }
}
