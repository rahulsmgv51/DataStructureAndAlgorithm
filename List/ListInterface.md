### Java List Interface
-   The List Interface extends the collection interface and adds methods that are specific to lists, which are ordered collections that allow duplicate elements.
Here are some methods that are present in the List interface but not in the Collection interface:

Collection Interface:
    - get(int index): Retrieves the element at the specified index in the list.
    - set (int indes, E element): Replaces the element at the specified indexwith the given element.
    - add(int index, E element): Inserts the specified element at the specified position in the list, shifting the current element to the right.
    - remove(int index): Removes the element at the specified indexfrom the list and shifts the remaining element to the left.



 `          Collection
 
              List

                    ( implementations)
                    
    ArrayList   LinkedList  Stack   Vector
`
