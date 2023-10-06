public class $15_LOOPS {
    public static void main(String[] args) {
        // loops in java

        // 01 for loop, printing first n odd numbers
        // The Java for loop is a control flow statement that iterates a part of the
        // programs multiple times.
        // If the number of iteration is fixed, it is recommended to use for loop
        System.out.println("01.First 5(N) odd Numbers using For loop : ");
        int N = 5;
        for (int i = 1; i <= N; i++) {
            System.out.println(2 * i);
        }

        // 02 While loop ,First 5(N) Even numbers :
        // The Java while loop is a control flow statement that executes a part of the
        // programs repeatedly on the basis of given boolean condition.
        // . If the number of iteration is not fixed, it is recommended to use while
        // loop.
        System.out.println("\n02.First 5(N) Even Numbers using while loop : ");
        int j = 0;
        while (j < N) {
            System.out.println(2 * j + 1);
            j++;
        }

        // 03 do while loop,
        // executes a part of the programs at least once and the further execution
        // depends upon the given boolean condition.
        // If the number of iteration is not fixed and you must have to execute the loop
        // at least once, it is recommended to use the do-while loop.
        int d = 1;
        System.out.println("Printing table of 9 using do while loop :");
        do {
            System.out.println(d * 9);
            d++;
        } while (d <= 10);
    }
}
