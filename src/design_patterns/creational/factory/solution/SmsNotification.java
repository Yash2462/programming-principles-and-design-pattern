package design_patterns.creational.factory.solution;

public class SmsNotification implements Notification{
    @Override
    public void notifyUser(String message) {
        System.out.println("sms notification: " + message);
    }
}
