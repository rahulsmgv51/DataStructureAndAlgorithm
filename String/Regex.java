import java.util.Scanner;
import java.util.regex.*;

public class Regex
{
	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0 && in.hasNextLine()){
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch (Exception e){
                System.out.println("Invalid");
            }
        }
    }
    
}