package BitManipulation_Mathematices;

public class DecimalToBinary {
    public static String toBinary(int N) {
        if(N <=0) return "";
        String str = "";
        while (N != 1) {
            int rem = N%2;
            N = N/2;
            str = rem+str;
        }
        str = N+str;

        return str;
    }

    public static void main(String[] args) {
        System.out.println(toBinary(0));
    }
}
