package JML0.task6;

interface Payable{
    double calculatePay();
    boolean validatePayment(double amount);
}

abstract class employmentType {
    protected String name;
    protected int id;

    //constructor
    public employmentType(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void displayEmployeeDetails(){
        System.out.println("employee name :" + name);
        System.out.println("employee id :" + id);
    }
    public abstract int calculateWorkHour(int hourWorked);
}

class Contractor extends employmentType implements Payable{
    private int hourlyRate;
    private int hoursWorked;

    public Contractor(String name, int id, int hourlyRate ){
        super(name, id);
        setHourlyRate(hourlyRate);
    }

    public void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0){
            throw new IllegalArgumentException("hourly rate cannot be <= 0");
        }
        this.hourlyRate = hourlyRate;
    }

    //for abstract class
    @Override
    public int calculateWorkHour(int hoursWorked){
        if(hoursWorked < 0){
            throw new IllegalArgumentException("work hour cannot be negative");
        }
        this.hoursWorked = hoursWorked;
        return hoursWorked;
    }

    @Override
    public double calculatePay(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public boolean validatePayment(double amount){
        return amount > 0;
    }
}

class PermanentEmployee extends employmentType implements Payable {
    private double baseSalary;
    private double bonus;

    public PermanentEmployee(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        setBaseSalary(baseSalary);
        setBonus(bonus);
    }

    public void setBaseSalary(double baseSalary) {
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

    public int calculateWorkHours(int hoursWorked) {
        if (hoursWorked < 0) {
            throw new IllegalArgumentException("Work hours cannot be negative.");
        }
        return hoursWorked;
    }

    @Override
    public double calculatePay() {
        return baseSalary + bonus;
    }

    @Override
    public boolean validatePayment(double amount) {
        return amount > 0;
    }

    public int calculateWorkHour(int hourWorked)
    {
        return hourWorked;
    }
}
