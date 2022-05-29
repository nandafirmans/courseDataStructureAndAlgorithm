package com.nocoffeeneedded.mySolutions;

public class MyPriorityQueue {
    private int[] items;
    private int count;

    public MyPriorityQueue(int size) {
        items = new int[size];
        count = 0;
    }

    public void enqueue(int nextItem) {
        if (isFull())
            throw new IllegalArgumentException();

        if (isEmpty()) {
            items[0] = nextItem;
            count++;
            return;
        }

        for (var i = count - 1; i >= 0; i--) {
            var item = items[i];

            if (nextItem < item) {
                items[i + 1] = item;
            } else {
                items[i + 1] = nextItem;
                break;
            }
        }

        count++;
    }

    public int dequeue() {
        if (isEmpty())
            throw new IllegalArgumentException();

        var removedItem = items[0];

        for (var i = 1; i <= count; i++) {
            var item = items[i];

            items[i - 1] = item;

        }

        count--;
        return removedItem;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
