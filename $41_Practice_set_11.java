//problem 01
abstract class Pen{
  abstract void write();
  abstract void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing on paper......");
    }
    public void refill(){
        System.out.println("Refilling the pen.....");
    }
    void chageNib(){
        System.out.println("Changing the nib.....");
    }
}

//problem 02
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    String name;
    Monkey(String name){
        this.name = name;
    }
    void jump(){
        System.out.println(name+" monkey is Jumping......");
    }
    void bite(){
        System.out.println(name+" monkey is Biting.....");
    }
}
class human extends Monkey implements BasicAnimal{
    human(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(name+ " is Eeating........Yum");
    }
    @Override
    public void sleep(){
        System.out.println(name+" is Sleeping.......zzzz");
    }
    void speak(){
        System.out.println(name+" is speaking something....");
    }
}

//05 interface that inharite another interface
interface samp1{
    void abc();
}
interface samp2 extends samp1{
    void def();
}
class samp3 implements samp2{
    public void abc(){
        System.out.println("\nThis is abc first random function from samp1");
    }
    public void def(){
        System.out.println("Thsi is def second random function from samp2");
    }
}
public class $41_Practice_set_11 {
    public static void main(String[] args) {
        //problem 1
        FountainPen fp = new FountainPen();
        fp.chageNib();
        //02 create a java monkey class with jump() and byte() methods , create a class human
        //  which inherite  monkey class and implements BasicAnimal interface with 
        //  eat() and sleep() methods
        human adam = new human("Adam");
        adam.eat();
        adam.speak();
        //03 demonstrate polymorphism usng monkey class
        Monkey bandar = new human("Bandar");
        bandar.jump();
        //bandar.speak(); //error , because refference is monkey
                //0r reference of interface BasicAnimal
        BasicAnimal ba1 = new human("Aadmi");
        ba1.sleep();
        //ba.bite(); // error

        //04 interface that inharit another interface
        samp3 xyz = new samp3();
        xyz.abc();
        xyz.def();
        
        
    }
}
