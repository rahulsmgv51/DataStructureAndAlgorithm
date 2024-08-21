package Opps.Keywords.Static_Keyword;

public class Student {

    // Static block

    static{
        System.out.println("Static block Call before excution of main method");
    }

    public static void main(String[] args) {
        // Before change in static variable
        Boys.bioData();
        Boys.name = "Rohan";  
        //  change in static variable      
        Boys.bioData();
        System.out.println("Name "+ Boys.name);

        Boys b1 = new Boys();
        b1.address="POP1";
        b1.age = 21;

        Boys b2 = new Boys();
        b2.address="POP2";
        b2.age = 22;

        Boys b3 = new Boys();
        b3.address="POP3";
        b3.age = 23;

        Boys b4 = new Boys();
        b4.address="POP4";
        b4.age = 24;

        Boys b5 = new Boys();
        Boys b6 = new Boys();
       

        System.out.println("Object Creation Count : "+Boys.count);
    }
}
