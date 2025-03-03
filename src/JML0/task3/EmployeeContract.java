package JML0.task3;

abstract class employeeContract {
    protected String employeeName;

    public employeeContract(String employeeName){
        this.employeeName = employeeName;
    }

    abstract void defineWorkHours();
    abstract void assignProject();
}

class Developer extends employeeContract{
    public Developer(String employeeName){
        super(employeeName);
    }

    @Override
    void defineWorkHours(){
        System.out.println(employeeName + " works from 9 AM to 5 PM with flexible hours option.");
    }

    @Override
    void assignProject(){
        System.out.println(employeeName + " is assigned to the frontend development project.");
    }
}

class Manager extends employeeContract{
    public Manager(String employeeName){
        super(employeeName);
    }

    @Override
    void defineWorkHours() {
        System.out.println(employeeName + " has no fixed working hours but is expected to fulfill 40 hours a week.");
    }

    @Override
    void assignProject() {
        System.out.println(employeeName + " is managing the product development team.");
    }
}