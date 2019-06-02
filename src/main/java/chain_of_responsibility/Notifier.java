package main.java.chain_of_responsibility;

public abstract class Notifier {
    private int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier notifier) {
        this.nextNotifier = notifier;
    }

    public void notifyManager(String message, int level){
        if (level >= priority){
            write(message);
        }
        if (nextNotifier != null){
            nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
