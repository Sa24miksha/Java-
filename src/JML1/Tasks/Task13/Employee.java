package JML1.Tasks.Task13;

public class Employee {
    private String name;
    private String Department;

    //Constructor
    public Employee(String name, String Department){
        this.name = name;
        this.Department = Department;
    }

    //Getters
    public String getName(){
        return name;
    }

    public String getDepartment(){
        return Department;
    }
}