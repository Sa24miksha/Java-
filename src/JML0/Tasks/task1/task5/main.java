package JML0.task5;

    public class main {
        public static void main(String[] args) {
            System.out.println("===== Using Fixed-Size Array =====");
            EmployeeArray empArray = new EmployeeArray(3);
            empArray.add(new Employee(101, "Sam"));
            empArray.add(new Employee(102, "Lekhi"));
            empArray.add(new Employee(103, "Shubhi"));
            empArray.display();

            empArray.delete(1);
            empArray.add(new Employee(103, "Shubhi"));
            empArray.display();

            System.out.println("\n===== Using Dynamic ArrayList =====");
            EmployeeArrayList empArrayList = new EmployeeArrayList();
            empArrayList.add(new Employee(201, "Sansu"));
            empArrayList.add(new Employee(202, "Laali"));
            empArrayList.add(new Employee(203, "Addu"));
            empArrayList.display();

            empArrayList.delete(1);
            empArrayList.display();
        }
    }

