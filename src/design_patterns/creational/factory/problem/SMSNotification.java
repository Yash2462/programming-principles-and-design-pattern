package design_patterns.creational.factory.problem;

public class SMSNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("Sending SMS notification with message: " + message);
    }
}
