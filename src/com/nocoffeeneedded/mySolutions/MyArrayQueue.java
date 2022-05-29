package com.nocoffeeneedded.mySolutions;

import java.util.Arrays;

public class MyArrayQueue {
    private int[] items;
    private int count;
    private int front;
    private int rear;

    public MyArrayQueue(int size) {
        items = new int[size];
        count = 0;
        front = 0;
        rear = 0;
    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalArgumentException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        if (count == 0)
            throw new IllegalArgumentException();

        var removed = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;

        return removed;
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
        // var contents = Arrays.copyOfRange(items, front, rear);
        return Arrays.toString(items);
    }

}
