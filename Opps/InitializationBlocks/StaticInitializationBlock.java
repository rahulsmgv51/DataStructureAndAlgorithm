package Opps.InitializationBlocks;


// Run only one time for evey obj and also run without creating object it depend on class
public class StaticInitializationBlock {
    private static int x;

    static{
        System.out.println("Intialization Block: X= "+x);
        x = 5;
    }

    // public StaticInitializationBlock(){
    //     System.out.println("Constructor:x="+x);
    // }

    public static void main(String[] args) {
        // StaticInitializationBlock t1 = new StaticInitializationBlock();
        // StaticInitializationBlock t2 = new StaticInitializationBlock();
    }
}
