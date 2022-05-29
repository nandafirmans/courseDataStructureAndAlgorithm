package com.nocoffeeneedded;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int count;
    private int front;
    private int rear;

    public ArrayQueue(int size) {
        items = new int[size];
        count = 0;
        front = 0;
        rear = 0;
    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        items[rear] = item;

        // using modulus operator (%) to implement circular array
        // so when enqueue happens and the rear pointer already reach endof items index
        // [0, 0, 50, 30, 60]
        //        F       R
        // next time we add items it would be like this: (which is out of bound of items array)
        // [0, 0, 50, 30, 60]
        //        F            R
        // so we need to reset the rear pointer to 0 using this function (Left % Length)
        // [0, 0, 50, 30, 60]
        //  R.....F
        rear = (rear + 1) % items.length;

        count++;
    }

    public int dequeue() {
        if (count == 0)
            throw new IllegalStateException();
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int peek() {
        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        var contents = Arrays.copyOfRange(items, front, rear);
        return Arrays.toString(contents);
    }

}
