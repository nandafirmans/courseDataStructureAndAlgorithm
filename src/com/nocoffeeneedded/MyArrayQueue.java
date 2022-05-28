package com.nocoffeeneedded;

import java.util.Arrays;

public class MyArrayQueue {
    private int[] items;
    private int size;
    private int count;
    private int front;
    private int rear;

    MyArrayQueue(int size) {
        this.size = size;
        items = new int[size];
        count = 0;
        front = 0;
        rear = 0;
    }

    public void enqueue(int item) {
        if (count == size)
            throw new IllegalArgumentException();

        items[rear] = item;
        rear = (rear + 1) % size;
        count++;
    }

    public int dequeue() {
        if (count == 0)
            throw new IllegalArgumentException();

        var removed = items[front];
        front = (front + 1) % size;
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
        return count == size;
    }

    @Override
    public String toString() {
        // var contents = Arrays.copyOfRange(items, front, rear);
        return Arrays.toString(items);
    }

}
