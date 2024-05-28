package BitManipulation_Mathematices;

public class ClearTheLastSetBit {
    public static int clearLastBit(int n){
        return n&(n-1);
    }

    public static void main(String[] args) {
        System.out.println(clearLastBit(26));
    }
}
