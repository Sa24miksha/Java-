package JML1.Tasks.Task11;

public class Employee {
    private String name;
    private int id;

    //Constructor
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
