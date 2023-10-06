import java.util.Scanner;

public class $18_Practice_set_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Java practice set no.4");
        // 1 printing a paitern using for loop
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("* ");
            }
            System.out.print("\n");
        }

        // 2 sum of first n even numbers
        // System.out.println("Program to print the sum of first n Odd numbers using
        // while loop");
        // System.out.print("Enter the number (1-20) : ");
        // int n = sc.nextInt();
        // int i=1,sum = 0;
        // while(i<=n){
        // if(n>20 || n<=0){
        // System.out.println("Invalid number, Please enter a number beetween 1-20");
        // break;
        // }
        // sum += (i*2+1); // chage i*2+1 to i*1 to get even
        // System.out.println(i*2+1);
        // i++;
        // if(i>n){
        // System.out.printf("Sum of first %d Odd numbers is : %d",n,sum);
        // }
        // }

        // //3 multiplication
        System.out.printf("\n\nEnter the number for table : ");
        int tab = sc.nextInt();
        int tsum = 0;
        for (int k = 1; k <= 10; k++) {
            System.out.println(tab + " X " + k + " = " + tab * k);
            tsum += (tab * k);
        }
        System.out.println("Sum of table is : " + tsum);

        // //4 multiplication reverse\
        // System.out.println("Table in reverse : ");
        // for(int k=10;k>=1;k--){
        // System.out.println(tab +" X " +k+ " = "+ tab*k);
        // }

        // 5 fectorial using for loop
        // System.out.print("Enter the number to calculate the factorial : ");
        // int f = sc.nextInt();
        // int fact = 1;
        // for (int m = 1; m <= f; m++) {
        // fact *= m;
        // }
        // System.out.printf("Factoral of %d using for loop is %d.\n", f, fact);

        // int p = 1;
        // fact = 1;
        // while (p <= f) {
        // fact *= p;
        // p++;
        // }
        // System.out.printf("Factoral of %d while for loop is %d.\n", f, fact);

        // 6 paitern 1 using while loop
        int x = 5;
        while (x >= 1) {
            int y = 1;
            while (y <= x) {
                System.out.printf("* ");
                y++;
            }
            System.out.printf("\n");
            x--;
        }

        // 7 => false

        sc.close();
    }
}
