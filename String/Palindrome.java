import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        int fi = 0, li = str.length()-1;
        boolean flag  = true;
        while(fi <= li){
            if(str.charAt(fi) != str.charAt(li)){
                flag = false;
            }
            fi++;
            li--;
        }

        if(flag){
            System.out.println("Palindome");
        }
        else{
            System.out.println("Not Palindome");
        }
    }    
}
