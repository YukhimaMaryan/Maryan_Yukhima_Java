package Practice2.Practice22;
//Task 1. Implement Builder for Email object with fields: to(string), cc(string), subject(string), body(string),
//priority(int), attachment(boolean: true/false). Fields to and subject are mandatory, other are optional.

public class Email {

    private final String to;
    private final String subject;


    private Email(EmailBuilder builder) {
        this.to = builder.to;
        this.subject = builder.subject;

    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public static class EmailBuilder {
        private final String to;
        private final String subject;

        public EmailBuilder(String to, String subject) {
            this.to = to;
            this.subject = subject;
        }

        public Email build() {
            return new Email(this);

        }
    
    }
}

