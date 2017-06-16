package com.teamtreehouse.techdegree;

import com.example.accessory.CameraAdapter;
import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.teamtreehouse.techdegree.hardware.Camera;
import com.teamtreehouse.techdegree.hardware.FrightMachine;

public class Main {
    private static final Horn horn = new Horn();
    private static final Strobe strobe = new Strobe();
    private static final Camera camera = new Camera();
    private static final CameraAdapter cameraAdapter = new CameraAdapter(camera);

    public static void main(String[] args) {
        FrightMachine machine = new FrightMachine();
        machine.addObservers(cameraAdapter);
        machine.addObservers(horn);
        machine.addObservers(strobe);
        machine.simulateMotion();
    }
}
