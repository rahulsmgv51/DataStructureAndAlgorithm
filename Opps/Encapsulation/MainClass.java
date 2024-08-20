package Opps.Encapsulation;

public class MainClass {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.teachingClass = 12;
        // Can not access due to private
        // teacher.id = 213;
    }
}