package Map.Hashing;
import java.util.HashMap;
import java.util.Map;

public class MyHashClass {
    public static void main(String[] args){
        String str = "GOD";
        int hash = 7;
        for(int i=0; i<str.length(); i++){
            hash = hash*31 + str.charAt(i);
        }
        System.out.println("Hash Code value of "+str+ " : "+ hash);

        // Pass the inital capacity and also pass the load factor
        Map<Integer, String> map = new HashMap<>(12, 0.5f); 
        
    }
}