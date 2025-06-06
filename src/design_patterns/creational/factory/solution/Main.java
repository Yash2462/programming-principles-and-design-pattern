package design_patterns.creational.factory.solution;

public class Main {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("email");
        notification.notifyUser("You have a new email!");
    }
}
