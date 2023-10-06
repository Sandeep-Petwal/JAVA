
//class 1
class cellphone {
    String name;
    cellphone(String name){
        this.name = name;
    }
    public void ring(){
        System.out.println(name +" is Ringing......");
    }
    public void call(){
        System.out.println(name +" is Calling......");
    }
}

//class 2
class square{
    int side;
    square(int side){
        this.side = side;
    }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return side*4;
    }
}
//class 3
class circle{
    int r;
    float pi = 3.14159265359f;
    circle(int side){
        this.r = side;
    }
    public float area(){
        return pi * (r*r);
    }
    public float perimeter(){
        return 2* pi * r;
    }
}

public class $28_Practice_set_8 {
    public static void main(String[] args) {
        System.out.println("Java Practice Set number.6");
        //1 create a class cellphone with method ringing and calling
        cellphone nokia = new cellphone("Nokia 105");
        nokia.call();
        nokia.ring();

        //2 circle
        square s1 = new square(45);
        System.out.printf("\nSide = %d\tArea = %d\tPerimeter = %d",s1.side,s1.area(),s1.perimeter());
       
        //3 circle
        circle c1 = new circle(15);
        System.out.printf("\nRadious = %d\tArea = %.2f\tPerimeter = %.2f",c1.r,c1.area(),c1.perimeter());
    }
}
