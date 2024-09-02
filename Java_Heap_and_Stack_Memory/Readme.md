### Java Heap and Stack Memory

1. In stack data place in organised and in heap data place as un-organised  form.
2. int, byte, short, long, float, double, boolean, and char they are stored on the stack, which allows for fast access and efficient memory management.
3. If reference remove from any object then garbage collector remove its value.
4. Heap memory are not thread safe and Stack are thread safe, so we need to synchronization in heap memory.

### Heap Memory

1. Java Heap space is used by java runtime to alocate memory to Objects and JRE classes. whenever we create an object, it's always created in the Heap space.

2. Any object created in the heap space has global access and can be referenced from anywhere of the application.

### Stack Memory

1. Java Stack memory ontains method-specific values that are short-lived and references to other objects in the heap thar is getting referred from the method.

2. Whenever a method is invoked, a new block is created in the stack memory for the method to hold local primitive values and reference to other objects in the method. As soon as the method ends, the block becomes unused and becomes available for the next method. Stack memory size is very less compared to heap memory.

![alt text](image-3.png)

![alt text](image-2.png)

