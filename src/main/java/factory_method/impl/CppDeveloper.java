package main.java.factory_method.impl;

import main.java.factory_method.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes java code...");
    }
}
