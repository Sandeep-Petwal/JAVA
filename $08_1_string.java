//string and strings methods in java by sandeep prasad
//strings are immutable and can't be changed
import java.util.Scanner;
public class $08_1_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
        String pm;
        pm = new String("Narendra Modi");
        //same  2.
        String state = "Uttrakhand";
        System.out.printf("PM = %s,\tState = %s",pm,state);
        
        //taking input from user
        System.out.print("Enter your name : "); 
        String name = sc.nextLine();
        System.out.printf("(%d).Welcome %s, how are you doing. ",1,name);

        //you can use System.out.printf(); with formate specifier like- %d,%c,%f and %s for taking input same like c language.

        sc.close();
    }   

}
