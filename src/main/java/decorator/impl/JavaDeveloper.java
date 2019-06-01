package main.java.decorator.impl;

import main.java.decorator.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public String doJob() {
        return "Writes java code!";
    }
}
