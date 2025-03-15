package JML0.task4;

public class Employee {
    private String name;
    private double baseSalary;
    private double  bonus;

    public Employee(String name, double baseSalary, double bonus){
       this.name = name;
       setBaseSalary(baseSalary);
       setBonus(bonus);
    }

    public void setBaseSalary(double baseSalary){
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
        this.baseSalary = baseSalary;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            throw new IllegalArgumentException("Bonus cannot be negative.");
        }
        this.bonus = bonus;
    }

    public void displaySalaryDetails() {
        System.out.println("Employee: " + maskName(this.name));
        System.out.println("Base Salary: $" + this.baseSalary);
        System.out.println("Bonus: $" + this.bonus);
        System.out.println("Total Compensation: $" + (this.baseSalary + this.bonus));
    }

    private String maskName(String name) {
        if (name.length() <= 1) return name;
        return name.charAt(0) + "*".repeat(name.length() - 1);
    }

}
