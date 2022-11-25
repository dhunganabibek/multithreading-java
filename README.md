# Multi Threading class by JavaBrain


## Thread creation
```
a. extending Thread class
b. using Runnable interface (Anonymous inner class and lambda expression)

```


## Setting thread to be daemon so it do not main thread can quit without waiting for it
```
t.setDaemon(true);
```


## Thread Lifecycle
```
a. new
b. Runnable
c. Blocked 
d. Waiting
e. Timed Waiting
f. Terminated
```

## Waiting for the Thread
```
Thread.sleep() -- thread sleep for certain amount of time.
myThread.join() -- the caller thread excute after myThread is completed.

```

## stopping a Thread
```
a. Do not use myThread.stop()   -- Deprecreted
b. can interrupt a thread.  -- t.interrupt(). 
 -- allows you to do clean up before thread dies.

```
***

## Synchronization
```
a. What is two thread need to share data?
  -- Race Condition. If two thread are reading and writing to the memory.
```

## Race Condition Pattern
```
a. check-then-act pattern
b. read-modify-write
```

### Solving Race Condition
```
a. Lock and key Model
  -- synchronization. 
   Protecting the data. JVM features.
   
   Programmer marks a data as a lock.
```


## How synchronozation Lock
```
JVM create a virtual lock from the data element.
Ant thread that need to use/modify that data need to get that lock.
```

## Using synchronization
```

```






