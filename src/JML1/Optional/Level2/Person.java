package JML1.Optional.Level2;

import java.util.Optional;

class Person {
    private String name;
    private Optional<String> email;

    //Constructor
    public Person(String name, String email){
        this.name = name;
        this.email = Optional.ofNullable(email);
    }

    //Getters
    public String getName(){
        return name;
    }

    public Optional<String> getEmail(){
        return email;
    }
}


