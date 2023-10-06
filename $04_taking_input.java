import java.util.Scanner;

public class $04_taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input frome user !");
        // creating Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String name = sc.nextLine();

        // Numerical input
        int age = sc.nextInt();
        double salary = sc.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        sc.close();
    }
}
