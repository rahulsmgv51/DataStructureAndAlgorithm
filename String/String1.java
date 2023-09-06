public class String1{
    public static void main(String[] args) {
        String name = "Anuj";
        String name2 = new String("Anuj");
        // System.out.println(name.charAt(0));
        System.out.println(name.equals(name2));
        
         String cars = "Hyundai, Maruti, Swift, Wagnor";
         String aCars[] = cars.split(",");

         for (String string : aCars) {
            System.out.println(string);
         }

        String s = "    My name is Rahul Kumar Vishwakrma    ";
        System.out.println(s.indexOf("m"));
        System.out.println(s.trim());
    }
}