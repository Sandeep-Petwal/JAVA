import java.util.Scanner;

public class $06_practice_set1 {
    public static void main(String[] args) {

        //01 problem no.1
        System.out.println("\n******01 :");
        System.out.println("****Program to calculate percentage and CGPA*****");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your total marks (out of 500) : ");
        float marks = sc.nextFloat();
        float per = (marks*100)/500;
        float cgpa =(float)(per/9.5);
        System.out.println("Marks : "+marks+"/500");
        System.out.println("Percentage  : "+per);
        System.out.println("CGPA : "+cgpa);
        
        //02  problem no.2
        System.out.println("\n******02 :");
        System.out.println("Enter your name : ");
        String name = sc.next();
        System.out.println("Hello "+ name +" how are you ?");
        
        //03  problem no.3
        System.out.println("\n******03 :");
        System.out.println("Program to convert km to miles ");//1km = 0.621371 miles
        System.out.println("Enter the length in KM : ");
        float km = sc.nextFloat();
        float miles = km * 0.621371f;
        System.out.println(km + "KM = "+miles +" Miles.");
        
        //04  problem no.4
        System.out.println("\n******04 :");
        System.out.println("Program to find weather it is integer or not ");
        System.out.print(sc.hasNextInt());    //this will scan the value and then return true or false
        System.out.println();

       sc.close();
    }
}
