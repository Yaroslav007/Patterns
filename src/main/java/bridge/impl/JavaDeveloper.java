package main.java.bridge.impl;

import main.java.bridge.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes JAVA code....");
    }
}
