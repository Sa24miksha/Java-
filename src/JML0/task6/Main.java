
                                // Abstarct class and Interface

package JML0.task6;

public class Main {
    public static void main(String[] args) {
        try{
            Contractor contractor = new Contractor("sam", 211, 30);
            contractor.calculateWorkHour(40);
            contractor.displayEmployeeDetails();
            System.out.println("Contractor Pay: $" + contractor.calculatePay());

            PermanentEmployee pm = new PermanentEmployee("Sung", 102, 3000, 500);
            pm.calculateWorkHour(48);
            pm.displayEmployeeDetails();
            System.out.println("Permanent Employee Pay: $" + pm.calculatePay());
        }
        catch(IllegalArgumentException e){
            System.out.println("Error :" + e.getMessage());
        }
    }
}
