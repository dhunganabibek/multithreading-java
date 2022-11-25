package com.bibekdhungana;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    int number = 0;

    while (true) {
      Scanner sc = new Scanner(System.in);
      System.out.println("I can tell you the nth Prime Number. Enter n ");
      int n = sc.nextInt();

      if (n == 0) {
        break;
      }

      number = PrimeNumberUtil.calculatePrime(n);
      System.out.println("The value of " + n + "th prime: " + number);
    }
  }
}
