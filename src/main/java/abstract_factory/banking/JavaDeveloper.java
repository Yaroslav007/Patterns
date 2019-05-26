package main.java.abstract_factory.banking;

import main.java.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes banking project...");
    }
}
