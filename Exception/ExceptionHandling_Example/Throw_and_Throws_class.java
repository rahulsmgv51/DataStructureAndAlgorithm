package Exception.ExceptionHandling_Example;

import java.util.Scanner;

public class Throw_and_Throws_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age > 99) {

                throw new MyException("My Custom Exception");
            }
        throw new ArithmeticException("More than 99 not allowd");
        } catch (MyException e) {
            System.out.println(e);
        }

    }
}

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}