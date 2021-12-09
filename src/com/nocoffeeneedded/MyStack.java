package com.nocoffeeneedded;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> items;
    private int length;

    public MyStack() {
        length = 0;
        items = new ArrayList<Integer>();
    }

    public void push(int value) {
        items.add(length, value);
    }

    public int pop() throws Exception {
        if (length <= 0)
            throw new Exception("please fill stack before pop it");

        var lastIndex = length - 1;
        var popedValue = items.get(lastIndex);

        items.remove(lastIndex);

        return popedValue;
    }

    public int peek() throws Exception {
        if (length <= 0)
            throw new Exception("please fill stack before pop it");

        return items.get(length - 1);
    }

    public int size() {
        return length;
    }
}
