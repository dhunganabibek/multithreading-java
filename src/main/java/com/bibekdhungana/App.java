package com.bibekdhungana;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

  public static void threadStatusInfo(List<Thread> threads)
    throws InterruptedException {
    System.out.println("-------------Thread Status----------------");
    threads.forEach(thread -> System.out.println(thread.getState()));
  }

  public static void main(String[] args) throws Exception {
    final List<Thread> threads = new ArrayList<Thread>();
    while (true) {
      Scanner sc = new Scanner(System.in);
      System.out.println("I can tell you the nth Prime Number. Enter n ");
      final int n = sc.nextInt();

      if (n == 0) break;

      Runnable r = new Runnable() {
        @Override
        public void run() {
          int number = PrimeNumberUtil.calculatePrime(n);
          System.out.println("The value of " + n + "th prime: " + number);
        }
      };
      Thread t = new Thread(r);
      t.setDaemon(true);
      threads.add(t);
      t.start();
    }
    Thread reportThread = new Thread(() -> {
      while (true) {
        try {
          threadStatusInfo(threads);
          Thread.sleep(1000);
        } catch (Exception e) {
          System.out.println(e);
        }
      }
    });

    reportThread.start();
  }
}
