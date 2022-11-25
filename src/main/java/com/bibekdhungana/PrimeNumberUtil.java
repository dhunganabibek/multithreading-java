package com.bibekdhungana;

public class PrimeNumberUtil {

  public static int calculatePrime(int n) {
    int number = 1;
    int numberOfPrimeFounds = 0;
    int i;

    while (numberOfPrimeFounds < n) {
      number++;

      for (i = 2; i < number && number % i != 0; i++) {}

      if (i == number) {
        numberOfPrimeFounds++;
      }
    }

    return number;
  }
}
