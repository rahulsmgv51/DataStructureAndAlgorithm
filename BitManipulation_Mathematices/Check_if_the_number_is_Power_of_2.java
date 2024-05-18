package BitManipulation_Mathematices;

public class Check_if_the_number_is_Power_of_2 {
    public static boolean isPowerofTwo(long n) {
        if(n <= 0) return false;

        while (n%2==0) {
            n = n>>1;
        }

        return (n==1)?true:false;
    }

    public static boolean isPowerofTwo2nd(long n){
        
        return (n != 0) && ((n & (n - 1)) == 0);
        
    }   

    public static void main(String[] args) {
        System.out.println(isPowerofTwo(32));
    }
}