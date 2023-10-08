package Opps.Constructors_and_this_super_Keywords;

public class Test {
    Test(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
    }
}
