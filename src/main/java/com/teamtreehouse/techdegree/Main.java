package com.teamtreehouse.techdegree;

import com.example.accessory.Accessory;
import com.example.accessory.CameraAdapter;
import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.teamtreehouse.techdegree.hardware.Camera;
import com.teamtreehouse.techdegree.hardware.FrightMachine;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Horn horn = new Horn();
        Strobe strobe = new Strobe();
        Camera camera = new Camera();
        CameraAdapter cameraAdapter = new CameraAdapter(camera);

        FrightMachine machine = new FrightMachine();
        machine.addObserver(cameraAdapter);
        machine.addObserver(horn);
        machine.addObserver(strobe);
        machine.simulateMotion();
    }
}
