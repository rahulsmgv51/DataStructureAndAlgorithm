### The Static Keyword
1. If we want to access class members without creating an instance of the class, we need to declare the class members static.
2. Static variables can be accessed by calling the class name of the class.
3. There is no need to create an instance of class for accessing the static variables because static variables are the class variables and are shared among alll the class instances.

### Static variables
1. Only a single copy of static variable is created and shared among all the instances of the class.
2. Because it is a class-level variable, memory allocation of such variables only happens once when the class is loaded in the memory.
3. If an object modifies the value of a static variable, the change is reflected across all objects.
4. Static variables can be used in any type of method: static or non-static.
5. Non-static variables cannot be used inside static methods. it will throw a compile -time error. Because need to create object of non-static variables

### Static Methods
1. The static members and methods belong to the class rather than the instance of the class. When the implementation of the particular method is not dependent on the instance variables and instance methods, in this case, we can make that method to be static.
2. They are accessed by the name of the class.
3. The keywords such as this and super are not used in the body of the static method.
4. The modification of the static field value is not allowed.