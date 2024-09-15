### Wrapper Classes
- A Wrapper class in java is a class whose object wraps or contains primitive data types. When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types.

### Need of Wrapper Classes
- The classes in java.util package handles only objects and hence wrapper classes help in this case also.
- Data strutures in the Collection framework, such as Arraylist and Vector, store only Objects(refeence types) and not primitive types.
- An object is needed to support synchronization in multithreading.


### Autoboxing & Unboxing
-   The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing. For example - conversion of int to Integer, long to Long, double to Double, etc.

-   It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing. For example - conversion of Integer to int, Long to long, Double to double, etc.