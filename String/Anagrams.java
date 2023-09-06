import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }

        int alphbets[] = new int[128];
        for(int i=0 ; i<a.length(); i++){
            char cA = Character.toUpperCase(a.charAt(i));
            char cB = Character.toUpperCase(b.charAt(i));
            alphbets[cA]++;
            alphbets[cB]++;
        }

        for (int i : alphbets) {
            if(i%2 != 0){
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
