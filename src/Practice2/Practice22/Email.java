package Practice2.Practice22;
//Task 1. Implement Builder for Email object with fields: to(string), cc(string), subject(string), body(string),
//priority(int), attachment(boolean: true/false). Fields to and subject are mandatory, other are optional.

public class Email {

        private final String to;//required
        private final String subject;//required
        private final int priority;// optional
        private final String cc; // optional
        private final String body; // optional
        private final boolean attachment;// optional

    private Email(EmailBuilder builder) {
            this.to = builder.to;
            this.subject = builder.subject;
            this.priority = builder.priority;
            this.cc = builder.cc;
            this.body = builder.body;
            this.attachment = false;
        }

        public int getPriority () {
            return priority;
        }

        public String getTo () {
            return to;
        }

        public String getSubject () {
            return subject;
        }
        public String getCc () {
            return cc;
        }
        public String getBody () {
            return body;
        }
        public boolean getAttachment () {
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



