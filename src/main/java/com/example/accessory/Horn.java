package com.example.accessory;

import java.util.Observable;
import java.util.Observer;

public class Horn implements Accessory {
    @Override
    public void activate() {
        System.out.println("BEEEEEEEP!");
    }
}
