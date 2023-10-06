package Exersices;

import java.util.Scanner;

public class $01_Fibonacci {
    static void febb(int a , int b, int count, int n) {
        if (count == n+1) {
            return;
        } else {
            System.out.print(a + b+" ");
            febb(b, a + b, ++count, n);

        }
    }

    // 0 1 1 2 3 5 8
    static int at(int n){
        if (n==1 || n==2){
            return n-1;
        }else{
            return at(n-1) + at(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to desplay Fibonacci series up to n");
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        int a = -1, b = 1, c;
        for (int count = 1; count <= n; count++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        // using recursion
        System.out.println("\nFebbonacci using recorsion :");
        febb(-1, 1, 1, n);

        //nth term of febbonacci using recursion
        System.out.printf("\n%d term of febbonacci using recursion is : %d ",n,at(n));
        sc.close();
    }
}
