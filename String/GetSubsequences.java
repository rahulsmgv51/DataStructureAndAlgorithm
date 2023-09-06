import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class GetSubsequences {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println("Distinct subsquence "+  gss(str));
    }
    public static int gss(String str){
        LinkedHashSet<String> uniqueStrings = new LinkedHashSet<String>();
        int len  = (int) Math.pow(2, str.length());
        int arr[] = new int[str.length()];
        for(int i=0; i<len; i++){
            int tmp = i;
            String s = "";
            int j = str.length()-1;
            while(tmp > 0){
                int rem = tmp%2;
                arr[j--] = rem;
                tmp = tmp/2;
            }
           
            for(int k=0; k<arr.length; k++){
                if(arr[k] == 1){
                    s+=str.charAt(k);
                }
                else{
                    s+="_";
                }
            }
            // System.out.println(s);
            uniqueStrings.add(s);
        }
        List<String> asList = new ArrayList<String>(uniqueStrings);
        System.out.println(asList);
        return asList.size();
    }
}
