package Map.Hashing;
import java.util.Hashtable;

public class Frequency {
    public static void main(String[] args){
        String str = "asd dsfsd wewr awewar refa WRWEF WASDSA DW D S CSC SZA DXZ XSDX SXZAs dWDS DCS".toLowerCase();
        Hashtable <Character, Integer> map = new Hashtable<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' ' && map.containsKey(ch)){
                map.put(ch, map.getOrDefault(ch, map.get(ch))+1);
            }
            else if(ch != ' '){
                map.put(ch, 1);
            }
        }

        System.out.println(map);
    }
}
