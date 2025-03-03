package JML1.LambdaExpressions;

public class Main {
    public static void main(String[] args) {
//        SoftwareEngineer emp = new SoftwareEngineer();
        Employee emp = () -> "Software Engineer";
        System.out.println( emp.getName());
    }
}
