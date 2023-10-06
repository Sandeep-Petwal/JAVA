class pet{
    String name;
    public void eat(){
        System.out.println(name+" is eating..");
    }
    public void sleep(){
        System.out.println(name+" is sleeping..");
    }
    void setname (String name){
        this.name = name;
    }
}

//use extends keyword to inherite a class
class dog extends pet{

    public void bark(){
        System.out.println(name +" is barking");
    }
}
//multilevel inheritence
class tom extends dog{
        public void swim(){
            System.out.println(name + " is swimming...");
        }

        //running all perent+child methods
        void allactivity (){
            eat();
            sleep();
            bark();
            swim();
        }
}

public class $31_Inheritence {
    public static void main(String[] args) {
        System.out.println("Inheritence in java......");
        tom tommy = new tom();
        tommy.setname("Tommy");

        //running all activities through allactivity()
        tommy.allactivity();
    }
}
