package Opps.Encapsulation.Folder2;

import Opps.Encapsulation.Folder1.Person;

public class MainInEncapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Rohit");
        person.setAge(25);
        System.out.println("Name of Person "+person.getName()+" Age of Person " + person.getAge());
    }
}