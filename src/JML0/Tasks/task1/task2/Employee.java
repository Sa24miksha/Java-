package JML0.task2;

class Employee {
    private int baseSalary;
    private int partTimeSalary;

    public void calculateSalary(){
        System.out.println("calculating salary");
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary < 0) {
            throw new ArithmeticException("Please enter base salary >= 0");
        } else {
            baseSalary = baseSalary;
        }
    }

    public int getPartTimeSalary() {
        return partTimeSalary;
    }

    public void setPartTimeSalary(int partTimeSalary) {
        if (partTimeSalary < 0) {
            throw new ArithmeticException("Please enter Part time salary >= 0");
        } else {
            partTimeSalary = partTimeSalary;
        }
    }
}

class fullTimeEmployee extends Employee{
    private int annualBonus = 300;

    public void calculateSalary(){
        System.out.println("Full time employee salary :" + annualBonus + getBaseSalary());
    }

    public int getannualBonus(){
        return annualBonus;
    }

    public void setAnnualBonus(int annualBonus){
        if(annualBonus < 0){
            throw new ArithmeticException("annual salary should not be < 0");
        }
        else{
            this.annualBonus = annualBonus;
        }
    }
}

class partTimeEmployee extends Employee {
    private int hoursWorked;

    public void calculateSalary(){
        System.out.println("Part time employee salary :" + hoursWorked * getPartTimeSalary());
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        if(hoursWorked < 0){
            throw new ArithmeticException("Please enter hours worked >= 0");
        }else{
            this.hoursWorked = hoursWorked;
        }
    }
}
