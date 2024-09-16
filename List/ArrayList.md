### Internal Working of ArrayList
-   Initially, the array has a certain capacity, and as elements are added, it fills up.
when the capacity is reached, the ArrayList creates a new larger array and copies the elements from the old array to the new one. This process of resizing and copying is transparent to the user.

-   However, frequent resizing operations can lead to performance overhead, so the ArraylList increase its capacity by a certain factor to minimize the frequency of resizing.

-   new_list_size={(old_list_size*3)/2}+1