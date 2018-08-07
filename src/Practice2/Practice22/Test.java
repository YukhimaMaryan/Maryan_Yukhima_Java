package Practice2.Practice22;

public class Test {

    public static void main(String[] args) {
           System.out.println(Email.getInstance().getSubject());
        System.out.println(Email.getInstance().getTo());
        System.out.println(Email.getInstance().getBody());
        System.out.println(Email.getInstance().getCc());
        System.out.println(Email.getInstance().getPriority());
        System.out.println(Email.getInstance().getAttachment());

        }
    }

