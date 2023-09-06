package Opps.Inheritance.SecondExample;

public class Student extends Person{
    private int rollno;
    private String schoolName;
    
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    
}
