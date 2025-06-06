package design_patterns.creational.factory.problem;

public class Main {
    /*
    * Object creation logic is spread in the client code.
    * Hard to add new notification types.
    * Violates Open/Closed Principle.
    */
    public static void main(String[] args) {
        Notification notification;
        String type = "SMS"; // This can be "SMS", "Email", or "Push"
        if ("EMAIL".equals(type)) {
            notification = new EmailNotification();
        } else if ("SMS".equalsIgnoreCase(type)) {
            notification = new SMSNotification();
        } else {
            notification = null;
        }

        if (notification != null) {
            notification.notifyUser("This is a test notification");
        } else {
            System.out.println("Invalid notification type");
        }
    }
}
