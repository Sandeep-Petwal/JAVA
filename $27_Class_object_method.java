class fivesem {
    int id;
    String name;
    int roll;
    int age=20; //default

    //public method to desplay student data
    public void show(){
        System.out.printf("\nID = %d\tName = %S\tRoll No. = %d\tAge = %d",id,name,roll,age);
    }

    //constructor to set data (runs automatically when object is created)
    //A constructor in Java is a special method that is used to
    //  initialize objects. The constructor is called when an object of a 
    //  class is created. It can be used to set initial values for object 
    //  attributes:
    fivesem(int id,String name,int roll,int age){
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.age = age;
    }
    fivesem(int id,String name,int roll){
        this.id=id;
        this.name = name;
        this.roll = roll;
    }
}

public class $27_Class_object_method{
    public static void main(String[] args) {
        fivesem student1 = new fivesem(001,"Abhishek Rana", 2109805001,60);

        fivesem student2; //aknonemous object
        student2 = new fivesem(002, "Aman Khati", 2109805002);//constructor overloading age will
        // be default 20 for student2
        student1.show();
        student2.show();
    }
}