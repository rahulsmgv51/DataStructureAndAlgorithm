package Opps.Inheritance.SecondExample;

public class MainClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollno(160);
        s1.setName("Rahul Kumar Vishwakrma");
        s1.setAge(24);
        s1.setSchoolName("CSJMU");
        System.out.println("RollNo : "+s1.getRollno()+ "\nName : "+s1.getName()+"\nAge : "+s1.getAge()+ "\nCollege : "+s1.getSchoolName());
    }
}
