package com.example.accessory;

import java.util.Observable;
import java.util.Observer;

public class Horn implements Accessory, Observer {
    @Override
    public void activate() {
        System.out.println("BEEEEEEEP!");
    }

    @Override
    public void update(Observable observable, Object o) {
        activate();
    }
}
