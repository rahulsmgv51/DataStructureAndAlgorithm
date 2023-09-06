package Opps.Constructors;

class Test2{
    //Overloading Constructor
    Test2(double d){
        this(19);
        System.out.println("Double arg Constructor is Calling");
    }

    Test2(int d){
        this();
        System.out.println("Int arg Constructor is Calling");
    }

    Test2(){
        System.out.println("No arg Constructor is Calling");
    }

    public static void main(String[] args) {
        Test2 test1 = new Test2(10.3);
        Test2 test2 = new Test2(12);
        Test2 test3 = new Test2();
    }
}