//variable argument in java
class $23_3_VarArgs {

    // Takes string as a argument followed by varargs
    static void sp(String str, int... a) {
        System.out.println("\nString : " + str);
        System.out.println("Number of arguments is: " + a.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // Calling fun2() with different parameter
        sp("Stronbraker", 100, 200); // argument will be pased as an array after first argument
        sp("Invencible", 1, 2, 3, 4, 5);
        sp("Incredible");
    }
}
