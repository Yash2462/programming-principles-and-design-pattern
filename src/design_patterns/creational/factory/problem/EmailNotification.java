package design_patterns.creational.factory.problem;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending email notification: " + message);
    }
}
