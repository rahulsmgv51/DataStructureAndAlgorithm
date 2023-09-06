package Opps.Encapsulation;

public class EncapsulationsIntro {
    public static void main(String[] args) {
        Students obj = new Students();
        
        obj.setAge(19);
        obj.setName("tom");

        System.out.println(obj.getAge());
    }
}
