package JML1.ConstructorReference;

public class Students {
    private String name;

    //Constructor
    public Students(String name) {
        this.name = name;
        System.out.println();
    }

    //Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

