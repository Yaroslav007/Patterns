package main.java.strategy;

import main.java.strategy.impl.Coding;
import main.java.strategy.impl.Reading;
import main.java.strategy.impl.Sleeping;
import main.java.strategy.impl.Training;

public class LifeRunner {

    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Training());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();
    }
}
