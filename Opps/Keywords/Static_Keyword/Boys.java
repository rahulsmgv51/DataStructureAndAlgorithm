package Opps.Keywords.Static_Keyword;

public class Boys {
    public static String name = "Rahul";
    // This value can not be change
    public static final String gendar = "male";
    public static int count = 0;

    static void bioData() {
        System.out.println("Name " + name);
    }

    public int age;
    public String address;

    public Boys(){
        count++;
    }
}
