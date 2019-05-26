package main.java.factory_method.factory.impl;

import main.java.factory_method.Developer;
import main.java.factory_method.factory.DeveloperFactory;
import main.java.factory_method.impl.CppDeveloper;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
