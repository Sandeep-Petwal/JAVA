//In Java, the super keyword is used to refer to the superclass (parent class) of the
//  current subclass (child class). It provides a way to access and call superclass methods

//superclass
class person {
    String name;

    person(String name){
        this.name = name;
    }
    void showName() {
        System.out.println("Name is : "+name);
    }
}

//subclass
class student extends person {
    int roll; 
    student(String name,int roll){
        super(name); // Call the superclass constructor using 'super'
        this.roll = roll;
    }
    
    // Method to display student information
    void show(){
        super.showName(); // // Call the displayInfo() method of the superclass using 'super'
        System.out.println("Roll no. is : "+roll);
        
    }
}
public class $32_this_AND_super {
    public static void main(String[] args) {
        System.out.println("this and super in java................");
        student john = new student("john sharma", 34);
        john.show();
    }
}