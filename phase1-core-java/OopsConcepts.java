import java.util.ArrayList;
import java.util.List;

public class OopsConcepts {

    public static void main (String[] args) {

        List<Notification> notifications = new ArrayList<>();
        notifications.add(new EmailNotification("Balakrishna@gmail.com"));
        notifications.add(new SmsNotification(9));

        for(Notification notification : notifications){

            notification.send();
        }


    }

interface Notification {

    void send();
}

static class EmailNotification implements Notification {

    private final String email;

    public EmailNotification(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void send(){
        System.out.println("Sending email to " + email);
    }
}

static class SmsNotification implements Notification {
    private final int num;

    SmsNotification(int num) {
        this.num = num;
    }

    public int getPhone() {
        return num;
    }

    @Override
    public void send() {
        System.out.println("Sending SMS to " + num);
    }
    }
}