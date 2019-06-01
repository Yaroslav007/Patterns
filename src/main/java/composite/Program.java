package main.java.composite;

import main.java.composite.impl.CppDeveloper;
import main.java.composite.impl.JavaDeveloper;

public class Program {

    public static void main(String[] args) {
        Team team = new Team();

        team.addDeveloper(new JavaDeveloper());
        team.addDeveloper(new CppDeveloper());
        team.addDeveloper(new JavaDeveloper());

        team.createProgram();
    }
}
