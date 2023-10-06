import java.util.Scanner;

public class $21_practice_set_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Practice set number 4...........");
        // 1. find out weather a given integer is present in array or not
        // int arr1[] = {23,45,65,45,73};
        // System.out.print("Enter the mumber you want to find out in array : ");
        // int in=-1;
        // int n1 = sc.nextInt();
        // for (int i=0;i<arr1.length;i++){
        // if(arr1[i] == n1){
        // in = i;
        // break;
        // }
        // }
        // if(in == -1){
        // System.out.println(n1 + " Element not found in array !");
        // }
        // else{
        // System.out.println(n1 + " Found in array at index : "+in);
        // }

        // 2 reversing an array
        // method 1
        // int l = arr1.length;
        // int arr2[] = new int[l];
        // System.out.print("Original array is : ");
        // for (int i : arr1) {
        // System.out.print(i+" ");
        // }

        // for(int e=0;e<l;e++){
        // arr2[(l-1)-e] = arr1[e];
        // }
        // System.out.print("\nRevers array is : ");
        // for (int b : arr2) {
        // System.out.print(b+" ");
        // }

        // method 2
        int sp[] = { 23, 555, 34, 99, 67, 76, 456, 54, 65, 56 };
        int len = sp.length;
        int mid = len / 2 - 1; // mid index
        System.out.println(mid);

        for (int i = 0; i < mid; i++) {
            int temp = sp[i];
            sp[i] = sp[len - 1 - i];
            sp[len - 1 - i] = temp;
        }

        System.out.print("\nReverse array 2 is : ");
        for (int bb : sp) {
            System.out.print(bb + " ");
        }

        // 3 maximum element in array
        int great = 0, ind = 0;
        for (int i = 0; i < len - 1; i++) {
            if (sp[i] > great) {
                great = sp[i];
                ind = i;
            }
        }
        System.out.printf("\nGratest element in array is %d at %d index.", great, ind);

        // 4 is array shorted or not
        int shor[] = { 21, 34, 45, 99, 56, 76, 89 };
        boolean isshor = true;
        for (int w = 0; w < shor.length - 1; w++) {
            if (!(shor[w] <= shor[w + 1])) {
                isshor = false;
                break;
            }
        }
        if (isshor) {
            System.out.println("\nThe array is shorted in ascending order\n");
        } else {
            System.out.println("\nThe array is not shorted in ascending order\n");

        }

        sc.close();
    }
}
