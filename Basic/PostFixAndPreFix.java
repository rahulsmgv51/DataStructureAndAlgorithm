package Basic;

public class PostFixAndPreFix {
    public static void main(String[] args){
        int a = 6;
        a+=a++ + ++a;
        System.out.println(a);
        int b = 4;
        b = b++ + ++b;
        System.out.println(b);
    }
}
