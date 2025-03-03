
                                    //ARRAY CHALLENGE

package JML0.task5;
import java.util.ArrayList;

// Employee class
class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "[ID: " + id + ", Name: " + name + "]";
    }
}

// Traditional Fixed-Size Array Implementation
class EmployeeArray {
    private Employee[] employees;
    private int size;

    public EmployeeArray(int capacity) {
        employees = new Employee[capacity]; // Fixed-size array
        size = 0;
    }

    // Add employee
    public void add(Employee emp) {
        if (size < employees.length) {
            employees[size] = emp;
            size++;
        } else {
            System.out.println("Array is full! Cannot add " + emp.name);
        }
    }

    // Display employees
    public void display() {
        System.out.print("Employees (Array): ");
        for (int i = 0; i < size; i++) {
            System.out.print(employees[i] + " ");
        }
        System.out.println();
    }

    // Delete employee at index
    public void delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            employees[i] = employees[i + 1]; // Shift elements left
        }
        size--;
    }
}

// Dynamic ArrayList Implementation
class EmployeeArrayList {
    private ArrayList<Employee> employeeList;

    public EmployeeArrayList() {
        employeeList = new ArrayList<>();
    }

    // Add employee
    public void add(Employee emp) {
        employeeList.add(emp);
    }

    // Display employees
    public void display() {
        System.out.println("Employees (ArrayList): " + employeeList);
    }

    // Delete employee at index
    public void delete(int index) {
        if (index < 0 || index >= employeeList.size()) {
            System.out.println("Invalid index!");
            return;
        }
        employeeList.remove(index);
    }
}
