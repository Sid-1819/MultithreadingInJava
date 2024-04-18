**Multithreading In Java**

Multiprocessing and Multithreading both are used to achieve Multitasking


Thread
-
A thread in Java is the direction or path that is taken while a program is being executed. Generally, all the programs have at least one thread, known as the main thread, that is provided by the JVM or Java Virtual Machine at the starting of the program's execution.

Threads use shared memory.

Threads are lightweight.

Used for faster context switching.

**TWO WAYS OF CREATING A THREAD**

1. BY EXTENDING THREAD CLASS
2. BY IMPLEMENTING RUNNABLE INTERFACE

**CONCURRENCY VS PARALLELISM**

Concurrency is about dealing with multiple things at once (like handling multiple connections).

Parallelism is about doing multiple things at once (like processing data). 

Correctly leveraging these concepts in Java networking leads to more responsive, efficient, and scalable network applications.

1.By extending Thread Class

Refer  **BasicThreading.java**

2.By implementing Runnable Interface

Refer **ThreadUsingRunnable.java**

**Difference between Thread class and Runnable Interface**


One significant distinction between Thread and Runnable arises from Java's support for single inheritance. A class extending Thread cannot extend any other class, limiting its flexibility. Conversely, a class can implement multiple interfaces, allowing it to implement Runnable and extend another class if necessary.

**Thread States in Java:**

1. **New**: This is the initial state of a thread. When a thread is created but not yet started, it's in the new state. The code associated with the thread has not begun execution.

2. **Runnable**: After invoking the start() method, the thread moves to the runnable state. Here, it's ready to run but might not be executing at that moment. Threads in this state can either be running or waiting for their turn to run.
3. **Running**: When the thread scheduler selects a thread from the runnable state to execute, it transitions to the running state. This is where the actual execution of the thread's code occurs.
4. **Blocked / Waiting**: Threads can enter this state when they need to wait for something, like a resource or a condition, to become available. For instance, if a thread needs access to a printer but another thread is using it, it will be blocked until the resource becomes available.
5. **Timed Waiting**: Similar to the blocked state, but with a time limit. Threads in this state wait for a specific amount of time before resuming execution. For example, when a thread invokes the sleep() method, it enters timed waiting for the specified duration.
6. **Terminated**: Threads reach this state when they complete their task or encounter an abnormal termination, such as an unhandled exception. Once terminated, a thread can't be restarted or resumed.