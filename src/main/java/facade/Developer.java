package main.java.facade;

public class Developer {

    public void  doJobBeforeDeadLine(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problems");
        }else {
            System.out.println("developer is reading Habrahabr");
        }

    }
}
