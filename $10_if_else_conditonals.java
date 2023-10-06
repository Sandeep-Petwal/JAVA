import java.util.Scanner;

public class $10_if_else_conditonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        byte num = sc.nextByte();
        if (num > 0) {
            System.out.println("The number is positive");
        } else if (num < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        System.out.print("\nNow enter your age : ");
        short age = sc.nextShort();
        if (age < 18) {
            System.out.println("You are a not an adult");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a senior citizen");
        }

        sc.close();
    }
}
