package com.bigonotation;

public class Main {
  public static void main(String[] args) {
    // write your code here
  }

  public static void log1(int[] numbers) {
    // O(1)
    System.out.println(numbers[0]); // O(1)
  }

  public static void log2(int[] numbers) {
    // O(1 + 1) ➡ O(2) ➡ simplify ➡ O(1)
    System.out.println(numbers[0]); // O(1)
    System.out.println(numbers[0]); // O(1)
  }

  public static void log3(int[] numbers) {
    // O(n)
    for (int i = 0; i < numbers.length; i++) // O(n)
      System.out.println(numbers[0]);
  }

  public void log4(int[] numbers) {
    // O(1 + n + 1) ➡ simplyfy ➡ O(2 + n) ➡ drop the constant ➡ O(n)

    System.out.println(numbers[0]); // O(1)

    for (int number : numbers) // O(n)
      System.out.println(number);

    System.out.println(numbers[0]); // O(1)
  }

  public void log5(int[] numbers) {
    // O(n + n) or O(2n) ➡ simplyfy ➡ O(n)

    for (int number : numbers) // O(n)
      System.out.println(number);

    for (int number : numbers) // O(n)
      System.out.println(number);
  }

  public void log6(int[] numbers, String[] names) {
    // O(n + m) ➡ simplyfy ➡ O(n)

    for (int number : numbers) // O(n)
      System.out.println(number);

    for (String name : names) // O(m)
      System.out.println(name);
  }
}
