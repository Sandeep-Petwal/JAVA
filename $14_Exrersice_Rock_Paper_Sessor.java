import java.util.Scanner;

import java.util.Random;

public class $14_Exrersice_Rock_Paper_Sessor {

    public static String rpc(int n) {
        String name = " ";
        switch (n) {
            case 1 -> {
                name = "PAPER";
            }
            case 2 -> {
                name = "CESSOR";
            }
            case 3 -> {
                name = "ROCK";
            }
        }
        return name;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int r, choice, computer = 0, user = 0;
        String name;

        System.out.println("\n\t Welcome to The Rock , Paper and Cessor Game");
        System.out.println(
                "Rules : You are compiting against the computer\nThere will be 5 round and who wins the most of round will be final winner");
        System.out.println("\t1 = Paper\t2 = Cessor\t3 = Rock\nSTART");
        System.out.print("Enter your Name : ");
        name = sc.next();

        for (int i = 1; i <= 5; i++) {
            int c2 = computer, u2 = user;
            r = rd.nextInt(3) + 1;
            System.out.print("\n( Round " + i + " ) What is your choice : ");
            choice = sc.nextInt();

            if (choice > r) {
                if (choice == 3 && r == 1) {
                    computer++;
                } else {
                    user++;
                }
            } else if (r > choice) {
                if (r == 3 && choice == 1) {
                    user++;
                } else {
                    computer++;
                }
            } else {
                System.out.println("It's a tie...");
            }

            if (computer > c2) {
                System.out.println("Computer Wins.");
            } else if (user > u2) {
                System.out.println("" + name + " Wins.");
            }
            System.out.printf("%s chose \"%s\" and Computer chose \"%s\".", name, rpc(choice), rpc(r));
            System.out.printf("\nSCORE : Computer = %d , %s = %d\n", computer, name, user);

        }

        // final
        if (computer > user) {
            System.out.println("\nFinal Result : Computer Wins :) \n");
        } else if (computer < user) {
            System.out.println("\nFinal Result : " + name + " Wins :) \n");
        } else {
            System.out.println("\nFinal Result : TIE...\n");
        }
        sc.close();
    }
}




// Sandeep Petwal 11/07/2023
