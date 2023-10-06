class cyllinder{
    int h,r;
    float pi=3.14159265359f;

    void setter(int h,int r){
        this.h= h;
        this.r= r;
    }
    int geth(){
        return h;
    }
    int getr(){
        return r;
    }
    float voluve(){
        return pi*(r*r)*h;
    }
    float area(){
        return (2*pi*r*h) + (2 *pi*r*r);
    }
}

public class $30_Practice_Set_9 {
    public static void main(String[] args) {
        //1 make a cyllinder class and set its height and width using getter and setter
        cyllinder c1 = new cyllinder();
        c1.setter(12, 9);
        System.out.println("Height : "+c1.geth());
        System.out.println("Width : "+c1.getr());
        System.out.printf("Volume = %.2f",c1.voluve());
        System.out.printf("\nSerface = %.2f",c1.area());
        
    }
}
