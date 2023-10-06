import java.util.Scanner;
public class $05_Exersice_Percentage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("program to print percentage of student out of five subjects(MM : 100)");
        System.out.println("Enter subject 1 marks  : ");
        int  s1 =  scan.nextInt();
        System.out.println("Enter subject 2 marks  : ");
        int  s2 =  scan.nextInt();
        System.out.println("Enter subject 3 marks  : ");
        int  s3 =  scan.nextInt();
        System.out.println("Enter subject 4 marks  : ");
        int  s4 =  scan.nextInt();
        System.out.println("Enter subject 5 marks  : ");
        int  s5 =  scan.nextInt();
        int  total = s1+s2+s3+s4+s5;
        System.out.println("You got "+total+" Marks out of 500");
        float per = (float) (total*100)/500;
        System.out.println("Your percentage is : "+per+"%");

        scan.close();
    }
}
