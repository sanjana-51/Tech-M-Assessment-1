import java.util.Scanner;

class Employee {
    private String name;
    private String empId;
    private double basicSalary;

    public Employee(String name, String empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    public double calculateNetSalary(double bonus, double tax) {
        return basicSalary + bonus - tax;
    }

    public void displaySalaryDetails(double bonus, double tax) {
        double netSalary = calculateNetSalary(bonus, tax);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Tax: " + tax);
        System.out.println("Net Salary: " + netSalary);
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        String empId = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = scanner.nextDouble();

        System.out.print("Enter Tax Amount: ");
        double tax = scanner.nextDouble();

        Employee employee = new Employee(name, empId, basicSalary);
        employee.displaySalaryDetails(bonus, tax);

        scanner.close();
    }
}
