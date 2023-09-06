import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }
        String tmpA = a.toLowerCase();
        String tmpB = b.toLowerCase();
        int ar[] = new int[tmpA.length()];
        int br[] = new int[tmpB.length()];
        for(int i=0; i<ar.length; i++){
            ar[i] = (int)tmpA.charAt(i);
        }
        for(int i=0; i<br.length; i++){
            br[i] = (int)tmpB.charAt(i);
        }

        Arrays.sort(ar);
        Arrays.sort(br);

        for(int i=0; i<ar.length; i++){
            if(ar[i] != br[i]){
                return false;
            }
        }
        

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
