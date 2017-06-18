package com.example.accessory;

import java.util.Observable;
import java.util.Observer;

public class Strobe implements Accessory {
    @Override
    public void activate() {
        System.out.println("Flashing lights!!!  Flash, flash, flash");
    }
}
