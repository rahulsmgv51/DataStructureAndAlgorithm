package Collection_Framewok;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Students {
    int rollNo;
    String name;

    public Students(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Students other = (Students) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Students [rollNo=" + rollNo + ", name=" + name + "]";
    }
}

public class Sets {
    public static void main(String[] args) {

        Students set1 = new Students(3, "Mohan");
        Students set2 = new Students(3, "Rohan");

        System.out.println(set1.equals(set2));
        
        Set<Students> s1 = new HashSet<>();
        s1.add(new Students(1, "Rahul"));
        s1.add(new Students(4, "Rahul"));
        s1.add(new Students(1, "Rahul"));
        s1.add(new Students(1, "Ram"));
        s1.add(new Students(2, "Naman"));
        System.out.println(s1);

        Set<Integer> hashSet = new HashSet<>(); // O(1)
        // Duplicate element not allowed so here we add multiple time 10 but it show
        // only one 10.
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        hashSet.add(60);
        // Elment print in random order
        // System.out.println("HashSet : " + hashSet);
        // hashSet.remove(10);
        // System.out.println(hashSet);

        Set<Integer> linkedHashSetSet = new LinkedHashSet<>(); // O(n)
        linkedHashSetSet.add(100);
        linkedHashSetSet.add(20);
        linkedHashSetSet.add(300);
        linkedHashSetSet.add(45);
        linkedHashSetSet.add(50);
        // Element give in same order
        // System.out.println("LinkedHashSet : " + linkedHashSetSet);

        Set<Integer> treeSet = new TreeSet<>(); // O(logn) and use binary tree
        treeSet.add(20);
        treeSet.add(12);
        treeSet.add(32);
        treeSet.add(10);

        // Print in sorted order in treeset
        // System.out.println("TreeSet : " + treeSet);
    }
}