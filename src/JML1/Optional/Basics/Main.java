package JML1.Optional.Basics;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> name = getName(2);
        String answer = name.orElse("NA");
        System.out.println(answer);
    }

    private static Optional<String> getName(int id) {
        return Optional.ofNullable("abs");
    }
}
