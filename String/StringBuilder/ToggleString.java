package StringBuilder;
import java.io.*;
import java.util.*;

public class ToggleString {

	public static String toggleCase(String str){
        StringBuilder s = new StringBuilder(str);
		int flag  = 1;
		if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){
			flag = 0;
			System.out.println("value of Flag "+ flag);
		}
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
            if(flag == 0 && ch >= 'a' && ch <= 'z'){
				char lc = (char) (ch - 'a' + 'A');
				System.out.println("char "+ lc);
				s.setCharAt(i, lc);
			}
			else if(flag == 1 && ch >= 'A' && ch <= 'Z'){
				char uc = (char)(ch - 'A' + 'a');
				System.out.println("char "+ uc);
				s.setCharAt(i, uc);
			}
        }
		return s.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		
		System.out.println(toggleCase(str));
	}

}