import animals.*;

public class Main {

    public static void main(String[] args) {
        
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
        System.out.println(m.noOfLegs());
    }
}
