package com.nocoffeeneedded;


// Array are the simplest data structures and we use them to store a list of item-
// like a list of numbers, string, object and literally anything.
// this item stored sequentially on the memory.

public class Array {
    public int[] items;
    public int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        // when doing Big O analysis we always consider the worst case scenario
        // so the run time complexity of this method is O(n)

        if (items.length == count) {
            var newItems = new int[count * 2];

            for (int i = 0; i < count; i++) // O(n)
                newItems[i] = items[i];

            items = newItems;
        }

        items[count++] = item; // O(1)
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) // O(1)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++) // O(n)
            items[i] = items[i + 1];

        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) // O(n)
            if (items[i] == item)
                return i;
        return -1;
    }

    public int max() {
        var max = items[0];
        for (int i = 0; i < count; i++) // O(n)
            max = max < items[i] ? items[i] : max;
        return max;
    }

    public void intersect(Array array) {
        var sumCount = count + array.count;
        var newItems = new int[sumCount];
        for (int i = 0; i < count; i++) // O(n)
            newItems[i] = items[i];

        var newItemIndex = count;
        for (int i = 0; i < array.count; i++) { // O(n)
            newItems[newItemIndex] = array.items[i];
            newItemIndex++;
        }

        items = newItems;
        count = sumCount;
    }

    public void reverse() {
        var newItems = new int[count];
        var newItemIndex = 0;

        for (int i = count - 1; i >= 0; i--) { // O(n)
            newItems[newItemIndex] = items[i];
            newItemIndex++;
        }

        items = newItems;
    }

    public void insertAt(int item, int index) {
        if (index >= count || index < 0)
            throw new IllegalArgumentException();

        var newCount = count + 1;
        var newItems = new int[newCount];

        for (int i = 0; i < newCount; i++)
            if (i == index)
                newItems[i] = item;
            else if (i > index)
                newItems[i] = items[i - 1];
            else
                newItems[i] = items[i];

        items = newItems;
        count = newCount;
    }

    public void print() {
        for (int i = 0; i < count; i++) // O(n)
            System.out.println(items[i]);

    }
}

