package main.java.chain_of_responsibility;

public class SMSNotofier extends Notifier {

    public SMSNotofier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SMS to manager: " + message);
    }
}
