### Generics
-   Generics means parameterized types. Using Generics, it is possible to create classes that work with diffrent data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

### Java Generics Method

-   Similar to the generic class, we can also create a method that can be used with any type of data. such a class is known as Generic Method.
public `<T>` void genericMethod(T data){.......}

-   Here, the type parameter `<T>` is inserted after the modifier public and before the return type void.
-   We can call the generics method by placing the actual type `<String>` and `<Integer>` inside the bracket before the method name.

`demo.<String>genericMethod("Java Programming");`
`demo.<Integer>genericMethod(25);`