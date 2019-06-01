package main.java.decorator;

import main.java.decorator.impl.JavaDeveloper;

public class Task {

    public static void main(String[] args) {
        Developer developer = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(developer.doJob());
    }
}
