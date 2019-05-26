package main.java.singelton;

public class ProgramLogger {

    private static ProgramLogger programLogger;
    private static String logFile = "Log file. \n\n";

    private ProgramLogger() {}

    public static synchronized ProgramLogger getProgramLogger(){
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }
            return programLogger;

    }

    public static void addLogInfo(String info){
        logFile = logFile.concat(info + "\n");
    }

    public static void showLogs(){
        System.out.println(logFile);
    }
}
