package main.java.observer;

public class JobSearch {

    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("first vacancy");
        jobSite.addVacancy("second vacancy");

        jobSite.addObserver(new Subscriber("Ivan Franko"));
        jobSite.addObserver(new Subscriber("Taras Shevchenko"));

        jobSite.addVacancy("third vacancy");

        jobSite.removeVacancy("first vacancy");
    }
}
