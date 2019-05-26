package main.java.abstract_factory;

import main.java.abstract_factory.banking.BankingProject;

public class PrivetBank {

    public static void main(String[] args) {

        ProjectTeamFactory teamFactory = new BankingProject();

        Developer javaDeveloper = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        System.out.println("Creating Private bank:");
        javaDeveloper.writeCode();
        tester.testCode();
        projectManager.manageProject();
        System.out.println("Private bank is created!");
    }
}
