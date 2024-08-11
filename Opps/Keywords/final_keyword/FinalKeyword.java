package Opps.Keywords.final_keyword;

class FinalKeyword {
    final int speedlimit = 90;// final variable


    //Can not change the value of speedlimit
    // void run() {
    //     speedlimit = 400;
    // }

    final void run(){System.out.println("running");}  

    // public static void main(String args[]) {
    //     FinalKeyword obj = new FinalKeyword();
    //     obj.run();
    // }
}
class Honda extends FinalKeyword{  
    //Can't Override run method
    // void run(){System.out.println("running safely with 100kmph");}  
      
    public static void main(String args[]){  
    Honda honda= new Honda();  
    honda.run();  
    }  
 }  
