## Stack
Stack is a simple linear data structure used for storing data. Stack follows the LIFO(Last In First Out) strategy that states that the element that is inserted last will come out first. You can take a pile of plates kept on top of each other as a real-life example. The plate which we put last is on the top and since we remove the plate that is at the top, we can say that the plate that was put last comes out first.  It can be implemented through an array or linked lists. Some of its main operations are: push(), pop(), top(), isEmpty(), size(), etc.  In order to make manipulations in a stack, there are certain operations provided to us. When we want to insert an element into the stack the operation is known as the push operation whereas when we want to remove an element from the stack the operation is known as the pop operation. If we try to pop from an empty stack then it is known as underflow and if we try to push an element in a stack that is already full, then it is known as overflow.

## Types of Stacks:
1. Register Stack: This type of stack is also a memory element present in the memory unit and can handle a small amount of data only. The height of the register stack is always limited as the size of the register stack is very small compared to the memory.
2. Memory Stack: This type of stack can handle a large amount of memory data. The height of the memory stack is flexible as it occupies a large amount of memory data. 


## Application of Stack Data Structure:
1. Function calls and recursion: When a function is called, the current state of the program is pushed onto the stack. When the function returns, the state is popped from the stack to resume the previous function’s execution.
2. Undo/Redo operations: The undo-redo feature in various applications uses stacks to keep track of the previous actions. Each time an action is performed, it is pushed onto the stack. To undo the action, the top element of the stack is popped, and the reverse operation is performed.
3. Expression evaluation: Stack data structure is used to evaluate expressions in infix, postfix, and prefix notations. Operators and operands are pushed onto the stack, and operations are performed based on the stack’s top elements.
4. Browser history: Web browsers use stacks to keep track of the web pages you visit. Each time you visit a new page, the URL is pushed onto the stack, and when you hit the back button, the previous URL is popped from the stack.
5. Balanced Parentheses: Stack data structure is used to check if parentheses are balanced or not. An opening parenthesis is pushed onto the stack, and a closing parenthesis is popped from the stack. If the stack is empty at the end of the expression, the parentheses are balanced.
6. Backtracking Algorithms: The backtracking algorithm uses stacks to keep track of the states of the problem-solving process. The current state is pushed onto the stack, and when the algorithm backtracks, the previous state is popped from the stack.

## Application of Stack in real life:
1. CD/DVD stand.
2. Stack of books in a book shop.
3. Call center systems.
4. Undo and Redo mechanism in text editors.
5. The history of a web browser is stored in the form of a stack.
6. Call logs, E-mails, and Google photos in any gallery are also stored in form of a stack.
7. YouTube downloads and Notifications are also shown in LIFO format(the latest appears first ).
8. Allocation of memory by an operating system while executing a process.

## Advantages of Stack:
1. Easy implementation: Stack data structure is easy to implement using arrays or linked lists, and its operations are simple to understand and implement.
2. Efficient memory utilization: Stack uses a contiguous block of memory, making it more efficient in memory utilization as compared to other data structures.
3. Fast access time: Stack data structure provides fast access time for adding and removing elements as the elements are added and removed from the top of the stack.
4. Helps in function calls: Stack data structure is used to store function calls and their states, which helps in the efficient implementation of recursive function calls.
5. Supports backtracking: Stack data structure supports backtracking algorithms, which are used in problem-solving to explore all possible solutions by storing the previous states.
6. Used in Compiler Design: Stack data structure is used in compiler design for parsing and syntax analysis of programming languages.
7. Enables undo/redo operations: Stack data structure is used to enable undo and redo operations in various applications like text editors, graphic design tools, and software development environments.

## Disadvantages of Stack: 
1. Limited capacity: Stack data structure has a limited capacity as it can only hold a fixed number of elements. If the stack becomes full, adding new elements may result in stack overflow, leading to the loss of data.
2. No random access: Stack data structure does not allow for random access to its elements, and it only allows for adding and removing elements from the top of the stack. To access an element in the middle of the stack, all the elements above it must be removed.
3. Memory management: Stack data structure uses a contiguous block of memory, which can result in memory fragmentation if elements are added and removed frequently.
4. Not suitable for certain applications: Stack data structure is not suitable for applications that require accessing elements in the middle of the stack, like searching or sorting algorithms.
4. Stack overflow and underflow: Stack data structure can result in stack overflow if too many elements are pushed onto the stack, and it can result in stack underflow if too many elements are popped from the stack.
5. Recursive function calls limitations: While stack data structure supports recursive function calls, too many recursive function calls can lead to stack overflow, resulting in the termination of the program.

## Basic Operations of Stack
1. push , pop IsEmpty, IsFull, Peek