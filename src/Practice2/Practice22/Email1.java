package Practice2.Practice22;

public class Email1 {
    public Email.EmailBuilder getEmail() {
        return new
                Email.EmailBuilder("Doctor", "Hi")
                .priority(1)
                .body("1234567")
                .cc("Fake address 1234");
    }

}
