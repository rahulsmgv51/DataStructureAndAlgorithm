import java.util.Scanner;

public class StringTokens {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        
        for(int i=0; i<s.length()-k+1; i++){
            String a = s.substring(i, i+k);
            smallest = a.compareTo(smallest) < 0 ? a : smallest;
            largest = a.compareTo(largest) > 0 ? a : largest;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}