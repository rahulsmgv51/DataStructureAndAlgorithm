package Basic;
import java.util.*;
import java.io.*;

class DataTypes{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x = sc.nextLong();
                System.out.println(x+" can be fitted in:");
                boolean shortFlag = false;
                boolean intFlag = false;
                boolean longFlag = false;
                
                if(x>=-32768 && x<=32767)shortFlag = true;
                if(x>=-2147483648 && x<=2147483647)intFlag = true;
                if(x<=Long.MAX_VALUE)longFlag = true;
                
                if(shortFlag)System.out.println("* short");
                if(intFlag)System.out.println("* int");
                if(longFlag)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}