### Garbage Collection
- In java destruction of object from memory is done automatically by the JVM.
- No delete keyword in java
- When there is no reference to an object, then that object is assumed to be no longer needed and the memory occupied by the object are released.
- This technique is called Garbage Collection.
- This is accomplished by the JVM.

### JVM Threads
- Whenever you run a java program, JVM created three threads.
    * main thread : The task of main thread is to execute the main() method.
    * Thread Scheduler : The task of thread scheduler is to schedule the threads.
    * Garbage Collector thread : The task of garbage collector thread is to sewap out abandoned object from the heap memory.

- In these three threads, main thread is a user thread and remaining two are daemon threads which run in background.

`Garbage collector thread : ` - Abandoned objects or dead objects are those objects which does not have live references.

### Finalize Method:
-   Garbage collector thread before sweeping out an abandoned object, it calls finalize() method of that object.
-   After finalize() method is executed, object is destroyed from the memory.

` Cannot force for garbage collection `
1. We can call garbage collector explicitly using `System.gc() or RunTime.getRunTime().gc()`
2. But, it is just a request to grabage collector not a command.
3. It is up to grabage collector to honour this request.


### Object's Memory
-   An object is created in the memory using new operator. Constructor is used to initialize the properties of that object.
-   When an object is no more required, it must be removed from the memory so that, that memory can be reused for other objects.


`No exception in finalize`
1. Exceptions occured in finalize() methodd are not propagated. Thery are ignored by the garbage collector
2. finalize() methods are not chained like constructors i.e ther is no calling statement to super class finalize() method inside the finalize() method of sub class. You need to explicitly call super class finalize() method.