package JML0.task3;

public class main {
    public static void main(String[] args) {
        employeeContract[] employee = new employeeContract[2];
        employee[0] = new Developer("Sam");
        employee[1] = new Developer("bob");

        for(employeeContract emp : employee){
            emp.defineWorkHours();
            emp.assignProject();
        }

    }
}
