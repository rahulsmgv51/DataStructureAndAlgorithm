### Java Queue Interface
-   The Queue interface of the Java Collections framework provides the functionality of the queue data structure. It extends the Collection Interface.

-   The Queue interface provides several methods for adding, removing, and inspecting elements in the queue. Here are some of the most commonly used methods:
    - add(element): Adds an element to the rear of the queue. If the queue is full, it throws an exception.
    - offer(element): Adds an element to the rear of the queue. If the queue is full, it returns false.
    - remove(): Removes and returns the element at the front of the queue. If the queue is empty, it throws an exception.
    - poll(): Removes and returns the element at the front of the queue. If the queue is empty, it returns null.
    - element(): Returns the element at the front of the queue without removing it. If the queue is empty, it throws an exception.
    - peek(): Returns the element at the front of the queue without removing it. If the queue is empty, it returns null.


### ArrayDeque in Java
-   The ArrayDeque class in Java is an implementation of the Deque interface that uses a resizable array to store its elements. This class provides a more efficient alternative to the traditional Stack class, which was previously used for double-ended operations. The ArrayDeque class provides constant-time performance for inserting and removing elements from both ends of the queue, making it a good choice for scenarios where you need to perform many add and remove operations.

### Advantages of using ArrayDeque:
-   Efficient: The ArrayDeque class provides constant-time performance for inserting and removing elements from both ends of the queue, making it a good choice for scenarios where you need to perform many add and remove operations.
-   Resizable: The ArrayDeque class uses a resizable array to store its elements, which means that it can grow and shrink dynamically to accommodate the number of elements in the queue.
-   Lightweight: The ArrayDeque class is a lightweight data structure that does not require additional overhead, such as linked list nodes, making it a good choice for scenarios where memory is limited.
-   Thread-safe: The ArrayDeque class is not thread-safe, but you can use the Collections.synchronizedDeque method to create a thread-safe version of the ArrayDeque class.
### Disadvantages of using ArrayDeque:
-   Not synchronized: By default, the ArrayDeque class is not synchronized, which means that multiple threads can access it simultaneously, leading to potential data corruption.
-   Limited capacity: Although the ArrayDeque class uses a resizable array to store its elements, it still has a limited capacity, which means that you may need to create a new ArrayDeque when the old one reaches its maximum size.
 
### Few important features of ArrayDeque are as follows:  
-   Array deques have no capacity restrictions and they grow as necessary to support usage.
-   They are not thread-safe which means that in the absence of external synchronization, ArrayDeque does not support concurrent access by multiple threads.
-   Null elements are prohibited in the ArrayDeque.
-   ArrayDeque class is likely to be faster than Stack when used as a stack.
-   ArrayDeque class is likely to be faster than LinkedList when used as a queue.


### Stack and Queue Operations Using ArrayDeque
1. Stack Operations:
    - push(E e): Pushes an element onto the stack represented by the deque.
    - pop(): Pops an element from the stack represented by the deque.

2. Queue Operations:
    - add(E e) or Offere(E e): Adds an element to the end of deque, effectively making it a queue.
    - remove() or poll(): Removes and returns the element at the front of the deque, making it a queue.