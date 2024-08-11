package Opps.Keywords.SuperKeyword;

public class Super_keyword {
    int wheel;
    String model = "nexon";

    Super_keyword(){
        System.out.println("Creating a vehical instance");
    }

    Super_keyword(int wheel){
        System.out.println("Creating a vehical instance and car have "+ wheel);
    }


    void stat(){
        System.out.println("Main class vehical start");
    }
}