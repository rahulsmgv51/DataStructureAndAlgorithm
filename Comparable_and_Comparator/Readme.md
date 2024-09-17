### Comparable and Comparator
- To sort custom object like Student or Employee, we need to provide explicit sorting logic.
To achive this. java allow us to define custom sorting behavior for objects, including sorting based on multiple data members.

### The Comparable Interface
-   This interface is found in java.lang package and contains only one method named `compareTo(object)`. It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. For example, it may be rollno, name, age or anything else.

`public int compareTo(Object obj):` It is used to compare the current object with the specified object. It returns
    * positive integer, if the current object is greater than the specified object.
    * negative integer, if the current object is less than the specified object.
    * zero, if the current object is equal to the specified object.

### The Comparator Interface
-   `The Comparator interface defines a compare(arg1, arg2) method ` with two argument that represent compared objects, and works similarly to the `Comparable.compareTo()` method.

` 
    public class PlayerAgeComparator implemens Comparator<Player>{
        @Override
        public int compare(Player firstPlayer, Player secondPlayer){
            return Integer.compare(firstPlayer.getAge(), secondPlayer.getAge());
        }
    }
`

### The Java 8 Comparator Interface
- Java 8 provide new ways of defining Comparators by using lambda expressions, and the comparing() static factory method.

`
Comparator byRanking = (Player player1, Player player2) -> Integer.compare(player1.getRanking(), player2.getRanking());
`


`
Comparator<Player> byRanking = Comparator.comparing(Player::getRanking);
Comparator<Player> byAge = Comparator.comparing(Player::getAge);
`