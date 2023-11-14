### Threads
1. A threads is an independent path of execution within a program.
2. Many threads can run concurrently within a program
3. Multithreading refers to two or more tasks executing concurrently within a single program.

#### There are two ways to create thread in java:
1. Implement the Runnable interface (java.lang.Runnable)
2. By Extending the Thread class (java.lang.Thread)


#### Thread States
1. A java thread is always in one of several states which could be running, sleeping, dead, etc.    
2. States:
    . New thread
    . Runnable
    . Not Runnable
    . Dead

#### Thread Priority
1. In java we can specify the priority of each thread relative to other threads
2. Those threads having higher priority get greater access to available resoources then lower priority threads.

#### Multiple Threads 
1. Problem with multithreading: When we start two or more threads within a program, there may be a situation when multiple threads try to access the same ressource, so there is a need to synchronize the action of multiple threads and make sure that only one thread can access the resource at a given  point in time.


#### Synchronization
1. synchronize is the action of multiple threads and make sure that only one thread can access the resource at a given  point in time.