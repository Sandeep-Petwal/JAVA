public class $23_2_Method_Overloading {

    //this will execute by passing three  arguments
    static void sum(int x,int y,int z){
        System.out.printf("Sum of %d , %d and %d is : %d\n",x,y,z,x+y+z);
    }

    //this will execute by passing two arguments
    static void sum(int x,int y){
        System.out.printf("Sum of %d and %d is : %d\n",x,y,x+y);
    }

    //this will execute by passing floats in argument
    static void sum(Float x,Float y){
        System.out.printf("\nSum of %f and %f is : %f\n",x,y,x+y);
    }

    public static void main(String[] args) {
        // With method overloading, multiple methods can have the same name with different parameters:
        sum(343.34f, 232.34f);
        sum(232, 3434);
        sum(232, 535, 898);

    }
}
