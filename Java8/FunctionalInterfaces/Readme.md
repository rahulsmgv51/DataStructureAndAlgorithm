### Functional Interfaces
1. An Interface  that contains excatly one abstract method is known as a functional interface.

2. Functional Interfaces introduced in java 8 allow us to use a lambda expression to initiate the interface's method and avoid using lengthy codes for the anonymous class implementation.

3. @FunctionalInterface An informative annotation type used to indicate that an interface type declaration is intended to be a functional interface as defined by the Java Language Specification.

### Lambda Expression
1. (int x) -> x+1           //Single declared-type argument
2. (int x) -> {return x+1;} // same as above
3. (x) -> x+1               // Single inferred-type argument, same as below
4. x -> x+1                 // Parenthesis optional for single inferred-type case

5. (String s) -> s.length()     //Single declared-type argument
6. (Thread t) -> {t.start();}   //Single decalred-type argument
7. s-> s.length()               //Single inferred-type argument
8. t-> {t.start();}             //Single inferred-type argument

9. (int x, int y) -> x+y        //Multiple declared-type parameters
10. (x,y) -> x+y                //Multiple inferred-type parameters