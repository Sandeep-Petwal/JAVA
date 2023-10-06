class Cube{
    int l;
    Cube(int len){
        this.l = len;
    }
    void areaCube(){
        System.out.printf("\nArea of cube is : %d X %d = %d",l,l,l*l);
    }
    void volumeCube(){
        System.out.printf("\nVolume of cube is : %d^3 = %d",l,l*l*l);
    }
}
class Ract extends Cube{
    int w,h;
    Ract(int len,int wid,int h){
        super(len);
        this.w = wid;
        this.h=h;
    }
    void areaRact(){
        System.out.printf("\nArea of Ractangle is : %d X %d = %d",l,w,l*w);
    }
    void volumeRact(){
        System.out.printf("\nVolume of Ractangle is : %d X %d X %d = %d",l,w,h,l*w*h);
    }
}
public class $36_Practice_set_10 {
    public static void main(String[] args) {
        Ract r69 = new Ract(23, 2,5);
        r69.areaCube();
        r69.volumeCube();
        r69.areaRact();
        r69.volumeRact();
    }
}
