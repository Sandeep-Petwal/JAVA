//interfaces --
interface terrestrial {
    void Swim();
}

interface aquatic {
    void Walk();
}

//creating class to extend for another class just for example
class animals{
    String name;

    animals(String name){
        this.name = name;
    }
    
    void eat(){
        System.out.println(name + " is Eating.......(*animal class)");
    }
}

//making class who extends animal and implemetnt two interfaces
class amphibians extends animals implements terrestrial,aquatic{
    amphibians(String name){
        super(name);
    }
    
    //you must override interfaces
    @Override
    public void Swim() {
        System.out.println(name + " is Swimming.......");
    }
    @Override
    public void Walk(){
        System.out.println(name + " is Walking.......");

    }
    
}
public class $38_1_Interface {
    public static void main(String[] args) {
        // aquatic and terrestrial
        amphibians frog = new amphibians("Mendhak69");
        frog.Swim();
        frog.Walk();
        frog.eat();
    }
}
