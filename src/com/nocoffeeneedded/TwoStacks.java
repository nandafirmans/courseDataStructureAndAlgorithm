package com.nocoffeeneedded;

public class TwoStacks {
    private int size;
    private int[] items;
    private int top1;
    private int top2;

    public TwoStacks(int size) {
        this.size = size;
        items = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void push1(int value) {
        if (top1 + 1 == top2)
            throw new IllegalStateException();

        items[++top1] = value;
    }

    public void push2(int value) {
        if (top2 - 1 == top1)
            throw new IllegalStateException();

        items[--top2] = value;
    }

    public int pop1() {
        if (top1 < 0)
            throw new IllegalStateException();

        return items[top1--];
    }

    public int pop2() {
        if (top2 >= size)
            throw new IllegalStateException();

        return items[top2++];
    }

    public int peek1() {
        if (top1 < 0)
            throw new IllegalStateException();

        return items[top1];
    }

    public int peek2() {
        if (top2 >= size)
            throw new IllegalStateException();

        return items[top2];
    }

    public boolean isEmpty1() {
        return top1 < 0;
    }

    public boolean isEmpty2() {
        return top2 >= size;
    }

    public boolean isFull1() {
        return top1 + 1 == top2;
    }

    public boolean isFull2() {
        return top2 - 1 == top1;
    }
}
