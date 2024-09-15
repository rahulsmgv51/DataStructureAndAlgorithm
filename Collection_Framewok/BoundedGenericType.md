### Bounded Generic Types
-   In general,the type parameter can accept any data types (except primitive types). However, if we want to use generics for some specific types(such as accept data of number types) only, then we can use bounded types.
-   In the case of bound types, we use the extends keyword.
-   Here, GenericClass is created with bounded type. This means GenericsClass can only work with data types that are children of Number(Integer, Double, and so on).

`class GenericClass <T extends Number> {
    public void display(){
        System.out.println("This is a bounded type generics class.");
    }
}`