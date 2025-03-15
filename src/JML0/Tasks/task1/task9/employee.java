package JML0.task9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

// 1. Define the PayrollAdjustment Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface PayrollAdjustment {
    boolean applyTax() default true;
    boolean applyOvertime() default false;
}

// 2. Employee Class
class Employee {
    private String name;
    private double baseSalary;
    private double overtimeHours;
    private double taxRate;

    public Employee(String name, double baseSalary, double overtimeHours, double taxRate) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.taxRate = taxRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', baseSalary=" + baseSalary + ", overtimeHours=" + overtimeHours + ", taxRate=" + taxRate + "}";
    }
}

// 3. PayrollProcessor Class with Custom Annotation Handling
class PayrollProcessor {

    // Standard salary calculation (before annotation)
    public double calculateSalary(Employee emp) {
        return emp.getBaseSalary();
    }

    // Annotated method for automatic tax and overtime adjustments
    @PayrollAdjustment(applyTax = true, applyOvertime = true)
    public double processSalary(Employee emp) {
        return emp.getBaseSalary();
    }

    // Method to process annotated payroll methods using reflection
    public void processPayroll(Employee emp) {
        try {
            Method[] methods = this.getClass().getDeclaredMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(PayrollAdjustment.class)) {
                    PayrollAdjustment adjustment = method.getAnnotation(PayrollAdjustment.class);

                    double baseSalary = (double) method.invoke(this, emp);
                    double finalSalary = baseSalary;

                    if (adjustment.applyTax()) {
                        double tax = baseSalary * emp.getTaxRate();
                        finalSalary -= tax;
                    }

                    if (adjustment.applyOvertime()) {
                        double overtimePay = emp.getOvertimeHours() * 20; // Assume $20 per overtime hour
                        finalSalary += overtimePay;
                    }

                    System.out.println("Processed salary for " + emp.getName() + ": " + finalSalary);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


