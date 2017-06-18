package com.teamtreehouse.techdegree.hardware;

import java.util.Observable;
import java.util.Observer;

public class Camera {

    public void snapPhotos(int numberOfPhotos) {
        for (int i = 0; i < numberOfPhotos; i++) {
            System.out.println("SNAP:  Photo #" + (i + 1) + " taken");
        }
    }
}
