import java.util.Scanner;

public class $23_1_Method {
    static void sumShow(int r, int s) {
        System.out.printf("Sum of %d and %d is : %d\n",r,s,r+s);
    }
    static int sum(int r, int s) {
        return r+s;
    }
    //even if you change variables value here it will not change in 
        // the main fuction axcept arr[]
        //because in case of array reffrence is passed
        static void changinArr (int arr[]){
            //changing value of array here will also channe the original value
            //because in arrays the reference is passed
            arr[0] = 99;

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a method is a way to perform some task. Similarly, the method in Java is a
        // collection of
        // instructions that performs a specific task. It provides the reusability of
        // code.
        // a method to only desplay the sum of two numbers :
        System.out.println("Enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumShow(a, b);

        // a method to desplay and calculate the sum of two numbers :
        int total = sum(a, b);
        System.out.println("Sum : "+total);


        //changing array element
        int marks[] = {32,43,54,65,56,56};
        System.out.println("Before calling the array function : "+ marks[0]);
        changinArr(marks);
        System.out.println("After calling the array function : "+ marks[0]);
        sc.close();
    }
}
