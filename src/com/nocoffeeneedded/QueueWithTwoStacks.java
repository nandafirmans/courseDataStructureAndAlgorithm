package com.nocoffeeneedded;

import java.util.Stack;

public class QueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item) {
        // O(1)
        stack1.push(item);
    }

    public int dequeue() {
        // O(n)
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.pop();
    }

    public boolean isEmpty() {
        // O(1)
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int peek() {
        // O(n)
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        // O(n)
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                var item = stack1.pop();
                stack2.push(item);
            }
        }
    }
}
