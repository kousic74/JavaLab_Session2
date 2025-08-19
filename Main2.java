import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept employee details from user
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();  // consume leftover newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(name, id, salary);

        System.out.println("\n--- Employee Details Before Update ---");
        emp.displayDetails();

        // Process command-line arguments for salary update
        if (args.length > 0) {
            try {
                double increment = Double.parseDouble(args[0]);
                emp.updateSalary(increment);

                System.out.println("\n--- Employee Details After Update ---");
                emp.displayDetails();
            } catch (NumberFormatException e) {
                System.out.println("Invalid increment value passed in command-line arguments.");
            }
        } else {
            System.out.println("\nNo salary increment provided via command-line arguments.");
        }

        sc.close();
    }
}
