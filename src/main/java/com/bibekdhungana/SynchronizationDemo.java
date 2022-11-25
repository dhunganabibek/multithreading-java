package com.bibekdhungana;


class Counter implements Runnable {
    private int value = 0;

    public void increment() {
        try {
            Thread.sleep(1000);
            value++;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    public void decrement() {
        value--;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void run() {

        //lock need to acquire by the thread. Only one thread can get it at a time.
        synchronized (this) {
            this.increment();
            System.out.println("Thread " + Thread.currentThread().getName() + " increments " + this.getValue());
            this.decrement();
            System.out.println("Thread " + Thread.currentThread().getName() + " decrements " + this.getValue());
        }
    }
}


public class SynchronizationDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        new Thread(counter, "One").start();
        new Thread(counter, "two").start();
        new Thread(counter, "Three").start();
        new Thread(counter, "Four").start();
    }

}
