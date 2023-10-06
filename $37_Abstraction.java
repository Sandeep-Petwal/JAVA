abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 5;
    }
    void sho(){
        System.out.println("he he  he ");
    }
}

class PNB extends Bank {
    int getRateOfInterest() {
        return 6;
    }
}

class $37_Abstraction {
    public static void main(String args[]) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
    }
}
