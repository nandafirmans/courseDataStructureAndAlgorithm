package com.nocoffeeneedded;

import java.util.ArrayList;
import java.util.Arrays;

public class MyStack {
    private ArrayList<Integer> items;
    private int length;

    public MyStack() {
        length = 0;
        items = new ArrayList<Integer>();
    }

    public void push(int value) {
        items.add(value);
        length++;
    }

    public int pop() {
        if (length <= 0)
            throw new IllegalStateException();

        var lastIndex = length - 1;
        var popedValue = items.get(lastIndex);

        items.remove(lastIndex);

        return popedValue;
    }

    public int peek() {
        if (length <= 0)
            throw new IllegalStateException();

        return items.get(length - 1);
    }

    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items.toArray());
    }
}
