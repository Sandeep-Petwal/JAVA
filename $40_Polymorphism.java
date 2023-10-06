//there are two types of polymorphism 1) compile-time by method overloading
//2) Run-time by Dynamic Method Dispatch
//Dynamic Method Dispatch or Runtime Polymorphism in Java

interface Shape {
    void draw();
}
interface Color {
    void colorShape();
}

class CircleX implements Shape,Color {
    //overrinding Shape
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    //Overriding Color
    @Override
    public void colorShape(){
        System.out.println("Coloring the circle");
    }
}
class Rectangle implements Shape,Color {
    @Override
    public void draw() {
        System.out.println("Drawing a Ractangle");
    }
    @Override
    public void colorShape(){
        System.out.println("\nColoring the Ractangle");
    }
}


public class $40_Polymorphism {
    public static void main(String[] args) {
        System.out.println("Dynamic Method Dispatch or Runtime Polymorphism in Java");
        // Create objects of Circle but refference of Shape
        Shape circle = new CircleX(); //it is Shape at this time you can't access colorShape() 
        circle.draw();
        //circle.colorShape(); //error because it is not defined in shape

        CircleX circle2 = new CircleX(); //you can access all methods defined in Circle now
        circle2.colorShape(); //shape of circle at this time
        circle2.draw();         //drow circle
        
        Rectangle rrr = new Rectangle();
        rrr.colorShape(); //shape of circle at this time
        rrr.draw();         //drow circle

    }
}
