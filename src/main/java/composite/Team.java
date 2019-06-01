package main.java.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Developer> developers = new ArrayList<>();

    void addDeveloper(Developer developer){
        developers.add(developer);
    }

    void deleteDeveloper(Developer developer){
        developers.remove(developer);
    }

    void createProgram(){
        System.out.println("Developers create project...");
        for (Developer developer:developers){
            developer.writeCode();
        }
    }
}
