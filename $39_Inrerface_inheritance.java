// interface can extend another interface in Java. This feature allows you to build on 
// existing interfaces and create hierarchies of interfaces. When one interface extends
//  another, it inherits the abstract methods declared in the parent interface, and any
//   class that implements the child interface must provide implementations for all the
//    abstract methods from both interfaces.

//interface extending another interface but a class can't extend interface
//class can only implement interfaces

interface inter1 {
    void meth1();

    void meth2();
}

interface inter2 extends inter1 {
    void meth3();

    void meth4();
}

// MyClass have to provide concrete implementations for all the abstract methods
// declared in the interface.
class MyClass implements inter2 {

    MyClass() {
        meth1();
        meth2();
        meth3();
        meth4();
    }

    public void meth1() {
        System.out.println("This is method one from interface Inter1");
    }

    public void meth2() {
        System.out.println("This is method two from interface Inter1");
    }

    public void meth3() {
        System.out.println("This is method Three from interface Inter2");
    }

    public void meth4() {
        System.out.println("This is method four from interface Inter2");
    }
}

public class $39_Inrerface_inheritance {
    public static void main(String[] args) {
        System.out.println("Interface inheritace in java.");
        MyClass objj = new MyClass();
    }
}
