package com.nocoffeeneedded;

public class BigONotation {
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
        // O(1 + n + 1) ➡ simplify ➡ O(2 + n) ➡ drop the constant ➡ O(n)

        System.out.println(numbers[0]); // O(1)

        for (int number : numbers) // O(n)
            System.out.println(number);

        System.out.println(numbers[0]); // O(1)
    }

    public void log5(int[] numbers) {
        // O(n + n) or O(2n) ➡ simplify ➡ O(n)

        for (int number : numbers) // O(n)
            System.out.println(number);

        for (int number : numbers) // O(n)
            System.out.println(number);
    }

    public void log6(int[] numbers, String[] names) {
        // O(n + m) ➡ simplify ➡ O(n)

        for (int number : numbers) // O(n)
            System.out.println(number);

        for (String name : names) // O(m)
            System.out.println(name);
    }

    public void log8(int[] numbers) {
        // O(n * n) or O(n ^ 2)

        for (int first : numbers) // O(n)
            for (int second : numbers) // O(n)
                System.out.println(first + ", " + second);
    }

    public void log9(int[] numbers) {
        // O(n + n ^ 2) ➡ simplify ➡ O(n ^ 2)

        for (int number : numbers) // O(n)
            System.out.println(number);

        for (int first : numbers) // O(n)
            for (int second : numbers) // O(n)
                System.out.println(first + ", " + second);
    }

    public void log10(int[] numbers) {
        // O(n ^ 3)

        for (int first : numbers) // O(n)
            for (int second : numbers) // O(n)
                for (int third : numbers) // O(n)
                    System.out.println(first + ", " + second + ", " + third);
    }
}
