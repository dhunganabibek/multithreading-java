package com.bibekdhungana;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
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
      t.start();
    }
  }
}
