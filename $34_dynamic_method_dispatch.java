//only overriden methods of subclass can be executed
class phone5 {
    public void game(){
        System.out.println("Playing low graphics snake game.....");
    }
}

class pphone extends phone5 {
    @Override //optional used for readability
    public void game(){
        System.out.println("Plalying BGMI in 60fps...");
    }
    public void takePhoto(){
        System.out.println("Clicking photo ... say cheese...");
    }
}

public class $34_dynamic_method_dispatch {
    public static void main(String[] args) {
        //declare a reference variable of superclass type and assign a new onject of 
        // subclass to this reference
        //sub               //super
        phone5  abcphone = new pphone();
        abcphone.game();
        //abcphone.takePhoto(); //will through error as only overriden method is allowed
    }
}
