//some casing of classes and method may be wrong in this program please ignore it for now

interface cam {
    void takePhoto();
    //private method
    private void lastPhoto(){
        System.out.println("This is the last photo.....");
    }
    //this is a default method if imlementation is not provided it wont't throw an error
    default void showGallary(){
            System.out.println("Showing photos....");
            lastPhoto();
    }
}

interface player {
    void playMusic();
}

class oldPhone {
    String name;

    oldPhone(String name) {
        this.name = name;
    }

    void callPolice() {
        System.out.println(name + " is dialing 911......");
    }
}

class newPhone extends oldPhone implements cam,player{
    newPhone(String name){
        super(name);
    }
    public void takePhoto(){
        System.out.println(name + " is clicking photo.....");
    }
    public void playMusic(){
        System.out.println(name+" is playing music.....");
    }
    // public void showGallary(){
    //     System.out.println(name+" is Showing gallary by implementing default method....");
    // }
}

public class $38_2_Interface_B {
    public static void main(String[] args) {
        System.out.println("\nHello, this is second example of java interface");
        newPhone Realme = new newPhone("RealmeC3");
        Realme.callPolice();
        Realme.takePhoto();
        Realme.playMusic();
        Realme.showGallary();
    }
}
