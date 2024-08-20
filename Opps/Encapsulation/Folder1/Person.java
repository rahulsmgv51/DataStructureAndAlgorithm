package Opps.Encapsulation.Folder1;

public class Person {
    private int age;
    private String name;

    boolean canBeChanges = true;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (canBeChanges && age > 18) {
            this.age = age;
        }
    }

    boolean canBeAccessed = true;

    public String getName() {
        if (canBeAccessed)
            return name;
        return null;

    }

    public void setName(String name) {
        this.name = name;
    }

}