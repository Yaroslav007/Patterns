package main.java.abstract_factory.banking;

import main.java.abstract_factory.Developer;
import main.java.abstract_factory.ProjectManager;
import main.java.abstract_factory.ProjectTeamFactory;
import main.java.abstract_factory.Tester;

public class BankingProject implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QaTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingProjectManager();
    }
}
