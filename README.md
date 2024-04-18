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


