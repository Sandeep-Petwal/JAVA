import java.util.Random;
import java.util.Scanner;

class game {
    Scanner sc = new Scanner(System.in);
    int r, user, attempt = 0;

    // constructor to set random number
    game() {
        Random rand = new Random();
        r = rand.nextInt(100);
    }

    void userInput() {
        System.out.printf("Enter you number : ");
        this.user = sc.nextInt();
    }
    void closeScanner(){
        sc.close();        
    }

    boolean isCorrect() {
        attempt++;
        if (r == user) {
            System.out.printf("Congratulation...%d is right.\nYou guessed it in %d attempts.", r, attempt);
            return true;
        } else if (r > user) {
            System.out.println("Number is Greater then " + user);
            return false;
        } else {
            System.out.println("Number is Lower then " + user);
            return false;
        }
    }
}

public class $29_Exersice_3 {
    public static void main(String[] args) {
        game g1 = new game();
        boolean b = false;
        while (b != true) {
            g1.userInput();
            b = g1.isCorrect();
        }
        g1.closeScanner();

    }
}
