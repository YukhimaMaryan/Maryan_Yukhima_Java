package Practice2.Practice22.Email;

public class EmailService {
    private static EmailService INSTANCE = new EmailService();

    private EmailService() {
    }

    public static EmailService getInstance() {
        return INSTANCE;
    }

    public Email.EmailBuilder sendMessage(){
        System.out.println("Message Send!");
        return  new
                Email.EmailBuilder
                ("Doctor", "Hi")
                .priority(1)
                .body("1234567")
                .cc("Fake address 1234")
                .attachment(true);

    }

}



