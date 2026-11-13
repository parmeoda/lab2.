import java.util.Scanner;

class Employee {
    double calculateSalary() {
        return 0.0;
    }
}

class FullTimeEmployee extends Employee {
    double basePay;
    double bonus;

    @Override
    double calculateSalary() {
        return basePay + bonus;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee type (full-time / part-time): ");
        String employeeType = input.nextLine();

        if (employeeType.equals("full-time")) {
            FullTimeEmployee employee = new FullTimeEmployee();

            System.out.print("Enter base pay: ");
            employee.basePay = input.nextDouble();

            System.out.print("Enter bonus: ");
            employee.bonus = input.nextDouble();

            System.out.println("Monthly Salary: $" + employee.calculateSalary());
        } else if (employeeType.equals("part-time")) {
            PartTimeEmployee employee = new PartTimeEmployee();

            System.out.print("Enter hourly rate: ");
            employee.hourlyRate = input.nextDouble();

            System.out.print("Enter hours worked: ");
            employee.hoursWorked = input.nextDouble();

            System.out.println("Monthly Salary: $" + employee.calculateSalary());
        } else {
            System.out.println("Please enter full-time or part-time.");
        }
    }
}