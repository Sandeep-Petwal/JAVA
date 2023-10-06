import java.util.Scanner;

public class $24_Recursion {
    static int fact(int num){
        if(num==1){
            return 1;
        }
        else {
             return num * fact(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to calculate Factorial using recursion : ");
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        System.out.printf("Factorial of %d is %d.\n",n,fact(n));
        sc.close();
    }
}
