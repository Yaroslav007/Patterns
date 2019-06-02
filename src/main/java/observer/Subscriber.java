package main.java.observer;

import java.util.List;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nWa have some changes here!\n Vacancies: " + vacancies +
                "\n====================================\n");
    }
}
