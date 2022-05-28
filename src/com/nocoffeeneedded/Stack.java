package com.nocoffeeneedded;

import java.util.Arrays;

public class Stack {
    private static int[] items;
    private static int count;

    Stack(int size) {
        items = new int[size];
        count = 0;
    }

    public void push(int item) {
        if (count == items.length)
            throw new StackOverflowError();

        items[count++] = item;
    }

    public int pop() {
        if (count <= 0)
            throw new IllegalStateException();

        return items[count--];
    }

    public int peek() {
        if (count <= 0)
            throw new IllegalStateException();

        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int min() {
        if (count <= 0)
            throw new IllegalStateException();

        return Arrays.stream(items).min().getAsInt();
    }

    @Override
    public String toString() {
        var contents = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(contents);
    }
}
