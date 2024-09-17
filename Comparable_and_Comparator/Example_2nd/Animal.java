package Comparable_and_Comparator.Example_2nd;

public class Animal implements Comparable<Animal>{
    private int age;
    private String name;
    private int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + name + ", weight=" + weight + "]\n";
    }

    //Sorting check on the basis of age
    @Override
    public int compareTo(Animal that) {
        //if age equal then i want to sort on basis of name then
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }
}