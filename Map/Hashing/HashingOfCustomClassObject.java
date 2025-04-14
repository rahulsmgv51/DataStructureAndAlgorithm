package Map.Hashing;
import java.util.List;
import java.util.Objects;

public class HashingOfCustomClassObject {
    public static void main(String[] args){
        String str = "c";
        System.out.println(str.hashCode());
        Boolean flag = true;
        System.out.println(flag.hashCode());
        flag = false;
        System.out.println(flag.hashCode());
        Double b = 16.43;
        System.out.println(b.hashCode());

        Boy b1 = new Boy("Rahul", 21, List.of(12, 32, 34));
        Boy b2 = b1;
        System.out.println("Custom Class b1: "+b1.hashCode());
        System.out.println("Custom Class b2: "+b2.hashCode());

        Boy b3 = new Boy("Rahul", 21, List.of(12, 32, 34));
        System.out.println("Custom Class b3: "+b3.hashCode());
    }
}

class Boy{
    String name;
    Integer age;
    List<Integer> marks;

    public Boy(String name, Integer age, List<Integer> marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Make your own custom hashcode function on the basis of given value by us.
    @Override
    public int hashCode(){
        // return name.hashCode();
        // return (name.hashCode() + age.hashCode());
        // return Objects.hash(name, age);
        return Objects.hash(age, name, marks);
    }
}