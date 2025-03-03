package JML1.Optional.Level2;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Person user1 = new Person("Sam", "sam@example.com");
        Person user2 = new Person("Bob" , null);

        System.out.println("Sam email is :" + " " + user1.getEmail().isPresent());
        System.out.println("Bob email is :" + " "+ user2.getEmail().isPresent());

        //1. Get email or provide as default
        String SamEmail = user1.getEmail().orElse("No email provided");
        String BobEmail = user2.getEmail().orElse("No email provided!");
        System.out.println("Sam's email :" + " " + SamEmail);
        System.out.println("Bob's email :" + " "+ BobEmail);

        //2. transform email to upperCase
        Optional<String> SamUpperCaseEmail = user1.getEmail().map(String::toUpperCase);
        SamUpperCaseEmail.ifPresent(email -> System.out.println("Sam's upper case email :" + " "+ email
        ));

        //3.As bobs email is null it will print nothing !
        Optional<String> BobUpperCaseEmail = user2.getEmail().map(String::toUpperCase);
        BobUpperCaseEmail.ifPresent(email -> System.out.println("Bob's upper case email" + " " + email));

        // 4. Filter email to check if it contains "example"
        Optional<String> filteredEmail = user1.getEmail().filter(email -> email.contains("example"));
        filteredEmail.ifPresent(email -> System.out.println("Filtered email: " + email));

        // 5. Throw an exception if email is absent
        try {
            String bobEmailOrThrow = user2.getEmail().orElseThrow(() -> new RuntimeException("Email not found!"));
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage()); // Error: Email not found!
        }

        // 6. Use flatMap() to handle nested Optional (e.g., if email itself was Optional)
        Optional<String> nestedEmail = Optional.of(user1)
                .flatMap(Person::getEmail)
                .map(String::toLowerCase);
        nestedEmail.ifPresent(email -> System.out.println("Nested email: " + email));


        // 7. Use ifPresent() to perform an action if email is present
        user1.getEmail().ifPresent(email -> System.out.println("Sending email to Sam: " + email));
        user2.getEmail().ifPresent(email -> System.out.println("Sending email to Bob: " + email)); // No output
//        [1,2,[4,4],5] -> [1,2,4,4,5]


        // int value = maybeOptional.orElse(6);
    }
}
