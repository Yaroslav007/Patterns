package main.java.composite.impl;

import main.java.composite.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code...");
    }
}
