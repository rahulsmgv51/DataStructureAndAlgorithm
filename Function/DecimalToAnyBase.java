package Function;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //Number which want to change any base
        int b = scn.nextInt();

        int i = 0;
        int decimalToAnyBaseNumber = 0;

        while(n!=0){
            int rem=n%b;
            System.out.println("Reminder" +rem);

            int power_of_10 = (int)Math.pow(10, i);
            System.out.println("power_of_10  " +power_of_10);

            decimalToAnyBaseNumber = decimalToAnyBaseNumber + rem*power_of_10;
            System.out.println("decimalToAnyBaseNumber "+decimalToAnyBaseNumber);

            i++;
            System.out.println("i++ =>>" +i);

            n=n/b;
            System.out.println("n/b ==>>" +n);

        }
        System.out.println(decimalToAnyBaseNumber);
    }
}

