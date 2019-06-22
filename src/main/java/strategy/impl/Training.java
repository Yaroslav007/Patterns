package main.java.strategy.impl;

import main.java.strategy.Activity;

public class Training implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Training...");
    }
}
