package main.java.prototype;

public class CloneRunner {
    public static void main(String[] args) {
        Project project = new Project(1, "master", "SourceCode code = new SourceCode()");
        System.out.println(project);

        System.out.println("===========================");

        System.out.println(project.clone());
    }
}
