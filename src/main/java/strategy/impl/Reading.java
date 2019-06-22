package main.java.strategy.impl;

import main.java.strategy.Activity;

public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading...");
    }
}
