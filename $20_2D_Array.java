public class $20_2D_Array {
    
    public static void main(String[] args) {
        System.out.println("Multidimentional array in java ");
        System.out.println("2D Array : ");
        int num[][] = { { 6, 12, 18 }, { 8, 16, 24 } };
         // declaring + memory allocation
        // desplaying 2d array using for loop
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
