import java.util.Scanner;

public class $13_practice_set_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPractice set no.3");

        // //01 what will the output of this problem //error i guess or nothing
        // int a = 10;
        // if(a==11){
        // System.out.println("I am 11.");
        // }else{
        // System.out.println("I am not 11.");
        // }

        // 02 student pass or not
        // System.out.println("Program to show the result of students (MM : 100)");
        // int sub[] = { 0, 0, 0 };
        // int total = 0, per;
        // boolean ispass = true;
        // for (int i = 0; i < 3; i++) {
        // System.out.printf("Enter the marks of subject %d : ", i + 1);
        // sub[i] = sc.nextInt();
        // if (sub[i] < 33) {
        // ispass = false;
        // }
        // total += sub[i];
        // }
        // System.out.println("Your total marks are : " + total + "/300");
        // per = total * 100 / 300;
        // if (per >= 40 && ispass) {
        // System.out.printf("\tCONGRATULATIONS You Passed the exam.\n");
        // System.out.println("You got "+total+"/300 Marks and "+per+"%.");
        // } else {
        // System.out.println("You got total " + per + "%,and you are FAILED ! ");
        // }

        // // 03 income tax generartor
        // float income, tax = 0;
        // System.out.print("Enter your income in lakhs (e.g. : 1.25) :");
        // income = sc.nextFloat();

        // if (income <= 2.5) {
        // tax = 0;
        // } else if (income > 2.5 && income <= 5.0) {
        // tax = income * 1000 * 5;
        // } else if (income > 5 && income <= 10) {
        // tax = income * 1000 * 5;
        // tax = tax + income * 1000 * 10;
        // } else if (income > 10) {
        // tax = income * 1000 * 5;
        // tax = tax + income * 1000 * 10;
        // tax = tax + income * 1000 * 30;
        // }
        // System.out.printf("Your sellary is %.2f lakhs,and you will pay %.2f tax.",
        // income, tax);

        // 04 leap year founder
        // Every year that is exactly divisible by four is a leap year, except for years
        // that are
        // exactly divisible by 100, but these centurial years are leap years, if they
        // are exactly
        // divisible by 400.
        // For example, the years 1700, 1800, and 1900 were not leap years, but the
        // years 1600 and 2000were.
        // 

        int y;
        System.out.print("Enter the year : ");
        y = sc.nextInt();
        boolean isleap = false;
        if(y%4==0){
            if(y%100==0){
                if(y%400 == 0){
                    isleap = true;
                }
            }
        }

        if(isleap){
            System.out.println(y+" is a leap year.");
        }else{
            System.out.println(y+" is not a leap year.");
        }
        sc.close();
    }
}
