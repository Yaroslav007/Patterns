package main.java.singelton;

public class Program {

    public static void main(String[] args) {
        ProgramLogger.addLogInfo("First line!");
        ProgramLogger.addLogInfo("Second line!");
        ProgramLogger.addLogInfo("Third line!");

        ProgramLogger.showLogs();
    }
}
