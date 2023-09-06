package StringBuilder;

import java.util.Scanner;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {
    public static String solution(String str){
		StringBuilder s = new StringBuilder();
        s.append(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int gap = curr - prev;
            s.append(gap);
            s.append(curr);
        }
		return s.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}
}
