package com.example.accessory;

import java.util.Observable;
import java.util.Observer;

public class Strobe implements Accessory, Observer {
    @Override
    public void activate() {
        System.out.println("Flashing lights!!!  Flash, flash, flash");
    }

    @Override
    public void update(Observable observable, Object o) {
        activate();
    }
}
