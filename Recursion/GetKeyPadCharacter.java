import java.util.*;

public class GetKeyPadCharacter {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(getKPC(str));
    }

    public static String kpc[] = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getKPC(ros);

        ArrayList<String> mres = new ArrayList<>();
        String codeforch = kpc[ch - '0'];
        for (int i=0; i<codeforch.length(); i++) {
            for (String string : rres) {
                mres.add(codeforch.charAt(i)+string);
            }
        }
        return mres;
    }
}