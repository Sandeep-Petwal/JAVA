import java.util.Scanner;

public class $11_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //traditional Switch
        int day = 5;
        System.out.print("\nEnter the number of day : ");
        day = sc.nextInt();
        if (day < 1 || day > 8) {
            System.out.println("Please a range between 1-7.");
        } else {
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5,8: //ading multiple cases for demo
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day number.");
                    break;
            }
        }

        //Upgraded Switch (Enhenced switch)
        //no need of break; statement
        switch(day){
            case 2 -> {
                System.out.println("\nTuesday");
            }
            case 7 -> {
                System.out.println("\nSunday");
            }
            default -> {
                System.out.println("\nNot specified in Enhenced Switch");
            }

        }

        sc.close();
    }
}