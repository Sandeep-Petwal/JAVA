import java.util.Scanner;


public class $25_Practice_set_6 {
    static void paitern(int n) {
        // 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3
    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

    // 4
    static float av(int... numbers) {
        int sum = 0;
        ;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (float) sum / numbers.length;
    }

    // 5
    static void paiternRecursion(int n) {
        if (n > 0) {
            paiternRecursion(n - 1);
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

    // 6
    static void paitern2Recursion(int n) {
        if (n == 1) {
            System.out.println("*");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            paitern2Recursion(n - 1);
        }
    }

    // 7 celcious - fehrenheite (°C × 9/5) + 32 = °F
    static float c2f(float c)
    {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 printing a n line of paitern using fumction
        System.out.print("\nEnter the line of paitern : ");
        int n = sc.nextInt();
        System.out.println("Paitern 1 :");
        paitern(n);

        // 2 reverse triangle paitern
        System.out.println("\nPaitern 2 :");

        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // // 3 Sum of first n natural numbers using recursion
        // System.out.print("\nEnter the number to get sum : ");
        // int num = sc.nextInt();
        // System.out.printf("Sum of first %d Natural number is : %d", num, sum(num));

        // 4 fint average of set of numbers passed as arguments
        System.out.printf("\nThe average of passed argument is : %.2f\n", av(2, 3, 5, 2, 2));

        // 5 paitern 1 using recusrion
        System.out.print("\nPaitern 1 using recurion : ");
        paiternRecursion(n);

        // 6 paitern 2 using recursion
        System.out.println("\nPaitern 2 using recurion : ");
        paitern2Recursion(n);

        // 7celcious to Fehrenheite
        System.out.print("Enter the temprature in cencious : ");
        float c = sc.nextFloat();
        System.out.printf("%.2f degree celcious = %.2f degree Fehrenheite.", c, c2f(c));

        sc.close();
    }
}