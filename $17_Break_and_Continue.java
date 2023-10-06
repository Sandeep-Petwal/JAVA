public class $17_Break_and_Continue {
    public static void main(String[] args) {
        // we used break statement in switch statements to break a case
        // The break statement can also be used to jump out of a loop.
        System.out.println("Java break and continue statements : ");
        System.out.println("Break : ");
        for (int i = 1; i <= 10000; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }

        // Java Continue
        // The continue statement breaks one iteration (in the loop), if a specified
        // condition occurs //
        // and continues with the next iteration in the loop.
        System.out.println("Continue :  ");
        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
