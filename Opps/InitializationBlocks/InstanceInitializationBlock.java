package Opps.InitializationBlocks;

public class InstanceInitializationBlock {
    private int x;

    // This block is called Instance Initialization block
    // It run when create this class object.
    {
        System.out.println("Intialization Block: X= "+x);
        x = 5;
    }

    public InstanceInitializationBlock(){
        System.out.println("Constructor:x="+x);
    }

    public static void main(String[] args) {
        InstanceInitializationBlock t1 = new InstanceInitializationBlock();
        InstanceInitializationBlock t2 = new InstanceInitializationBlock();
    }
}
