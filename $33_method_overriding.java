//If subclass (child class) has the same method as declared in the parent class,
// it is known as method overriding in Java.
class phone{
    public void game(){
        System.out.println("Playing low graphics snake game.....");
    }
}

class iphone extends phone{
    @Override //optional used for readability
    public void game(){
        System.out.println("Plalying BGMI in 60fps...");
    }
}

public class $33_method_overriding {
    public static void main(String[] args) {
        System.out.println("\nMethod overriding in java...");
        iphone iphoneX = new iphone();
        iphoneX.game();
    }
}
