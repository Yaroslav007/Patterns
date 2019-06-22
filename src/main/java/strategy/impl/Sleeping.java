package main.java.strategy.impl;

import main.java.strategy.Activity;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
