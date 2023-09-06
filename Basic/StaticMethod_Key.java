package Basic;
import java.util.*;

public class StaticMethod_Key {

    public static void main(String[] args) {}
       public static int B, H =0;
       
       static{
           try (Scanner scnn = new Scanner(System.in)){
            B = scnn.nextInt();
            H = scnn.nextInt();
            if (B <= 0 || H<=0)
                throw new Exception("Breadth and height must be positive");
            else
                System.out.println(B*H);
        } catch (Exception e) {
            System.out.println(e);
        }
       } 
    
}
