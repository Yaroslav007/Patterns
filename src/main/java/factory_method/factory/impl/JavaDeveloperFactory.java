package main.java.factory_method.factory.impl;

import main.java.factory_method.Developer;
import main.java.factory_method.factory.DeveloperFactory;
import main.java.factory_method.impl.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
