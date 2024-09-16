### Java Vector
-   The Java class synchronizes each individual operation. This means whenever we want to perform some operation on vectors, the Vector class automatically applies a lock to that operation.
-   It is because when one thread is accessing a vector, and at the same time another thread tries to access it, an exception called ConcurrentModificationException is generated. Hence, this continuous use of lock for each operation makes vector less efficient.
However, in array list, methods are not synchronized.

* Important points regarding the Increment of vector capacity are as follows:

-   If the increment is specified, Vector will expand according to it in each allocation cycle. Still, if the increment is not specified, then the vector’s capacity gets doubled in each allocation cycle. Vector defines three protected data members:

-   int capacityIncrement: Contains the increment value.
-   int elementCount: Number of elements currently in vector stored in it.
-   Object elementData[]: Array that holds the vector is stored in it.

* Common Errors in the declaration of Vectors are as follows:
-   Vector throws an IllegalArgumentException if the InitialSize of the vector defined is negative.
-   If the specified collection is null, It throws NullPointerException. 