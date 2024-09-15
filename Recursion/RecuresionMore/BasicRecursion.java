package RecuresionMore;

public class BasicRecursion {
    public static void main(String[] args) {
        // fun(5);
        System.out.println(sumOfNNumber(5));
    }
    static int sumOfNNumber(int n){
        if(n==1){
            return 1;
        }
        int sum = sumOfNNumber(n-1)+n;
        return sum;
    }
    // static void fun(int n) {
    //     if (n > 0) {
    //         System.out.println("Recursive Call Hello");
    //         fun(n--);
    //     }
    // }
}