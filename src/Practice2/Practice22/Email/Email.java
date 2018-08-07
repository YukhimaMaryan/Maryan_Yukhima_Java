package Practice2.Practice22.Email;
//Task 1. Implement Builder for Email object with fields: to(string), cc(string), subject(string), body(string),
//priority(int), attachment(boolean: true/false). Fields to and subject are mandatory, other are optional.
//Task 2. Implement Singleton for email sending service, so you can call it from any place
//EmailService.getInstance().sendMessage(<email>):

public class Email {



    public  String to;//required
    private  String subject;//required
    private  int priority;// optional
    private  String cc; // optional
    private  String body; // optional
    private  boolean attachment;// optional

    private Email(EmailBuilder builder) {
        this.to = builder.to;
        this.subject = builder.subject;
        this.priority = builder.priority;
        this.cc = builder.cc;
        this.body = builder.body;
        this.attachment = false;
    }

    public int getPriority() {
        return priority;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getCc() {
        return cc;
    }

    public String getBody() {
        return body;
    }

    public boolean getAttachment() {
        return attachment;
    }

    public static class EmailBuilder {
        private final String to;
        private final String subject;
        private int priority;
        private String cc;
        private String body;
        private boolean attachment;

        public EmailBuilder(String to, String subject) {
            this.to = to;
            this.subject = subject;
        }



        public EmailBuilder priority(int priority) {
            this.priority = priority;
            return this;
        }

        public EmailBuilder body(String body) {
            this.body = body;
            return this;
        }

        public EmailBuilder cc(String cc) {
            this.cc = cc;
            return this;
        }

        public EmailBuilder attachment(boolean attachment) {
            this.attachment = true;
            return this;
        }

        public Email build() {

            return new Email(this);
        }

    }

}

