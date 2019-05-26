package main.java.abstract_factory.banking;

import main.java.abstract_factory.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Project manager maneges banking system...");
    }
}
