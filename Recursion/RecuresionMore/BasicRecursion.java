package RecuresionMore;

public class BasicRecursion {
    public static void main(String[] args) {
        // fun(5);
        System.out.println(sumOfNNumbwr(5));
    }
    static int sumOfNNumbwr(int n){
        if(n==1){
            return 1;
        }
        int sum = sumOfNNumbwr(n-1)+n;
        return sum;
    }
    // static void fun(int n) {
    //     if (n > 0) {
    //         System.out.println("Recursive Call Hello");
    //         fun(n--);
    //     }
    // }
}