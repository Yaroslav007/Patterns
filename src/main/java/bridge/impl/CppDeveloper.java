package main.java.bridge.impl;

import main.java.bridge.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code...");
    }
}
