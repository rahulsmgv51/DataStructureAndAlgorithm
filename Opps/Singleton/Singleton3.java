package Opps.Singleton;

import java.util.HashMap;
import java.util.Map;

public class Singleton3 {
        Map<String, String> map = new HashMap<>();
    private Singleton3(){
        map.put("a", "Apple");
        map.put("b", "Boy");
    }

    private static Singleton3 obj = null;
    public static Singleton3 getSingleton3(){
        if(obj == null){
            obj = new Singleton3();
        }
        return obj;
    }
}

class Test{
    public static void main(String[] args) {
        Singleton3 x = Singleton3.getSingleton3();
        Singleton3 y = Singleton3.getSingleton3();
        Singleton3 z = Singleton3.getSingleton3();
        System.out.println(x.map.get("a")+"  ======  "+x.map.get("b"));
        System.out.println(y.map.get("a")+"  ======  "+y.map.get("b"));
        System.out.println(z.map.get("a")+"  ======  "+z.map.get("b"));

        x.map.put("a", null);
        System.out.println(x.map.get("a")+"  ======  "+x.map.get("b"));
        System.out.println(y.map.get("a")+"  ======  "+y.map.get("b"));
        System.out.println(z.map.get("a")+"  ======  "+z.map.get("b"));

    }
}
