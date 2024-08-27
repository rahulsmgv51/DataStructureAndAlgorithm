1. A non-static nested class is a class within another class. It has access to members of the enclosing class(outer class). It is commonly konow as inner class.
2. Since the inner class exists within the outer class, you must instantiate the outer class first, in order to instantiate the innser class.
3. Unlike inner class, a static nested class cannot access the member variables of the outer class. It is because the static nested class does not require you to create an instance of the outer class.
4. Using the nested class makes your code more readable and provide better encapsulation.