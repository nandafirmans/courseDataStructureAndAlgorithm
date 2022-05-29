package com.nocoffeeneedded;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import com.nocoffeeneedded.mySolutions.MyArrayQueue;
import com.nocoffeeneedded.mySolutions.MyPriorityQueue;

public class Main {
    public static void array(String[] args) {
        Array numbers2 = new Array(2);
        numbers2.insert(100);
        numbers2.insert(200);
        numbers2.insert(300);
        numbers2.print();

        System.out.println("\n");

        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insertAt(22, 2);
        numbers.insertAt(11, 0);
        numbers.intersect(numbers2);
        numbers.reverse();

        numbers.print();
    }

    public static void linkedList() {
        var list = new LinkedList();
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addFirst(10);
        list.addFirst(5);
        list.addFirst(1);
        list.removeLast();
        // list.removeFirst();
        // list.reversed();
        list.print();
        // System.out.println("\n");
        // System.out.println(list.indexOf(20));
        // System.out.println(list.contains(1));
        // System.out.println(list.size());
        // System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.getKthFromTheEnd(3));
    }

    public static String stackReversedList(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        var stacks = new Stack<Character>();

        for (var ch : input.toCharArray())
            stacks.push(ch);

        var reversed = new StringBuilder();
        while (!stacks.isEmpty())
            reversed.append(stacks.pop());

        return reversed.toString();
    }

    public static void stack() {
        // System.out.println(stackReversedList("abcde"));
        // var exp = new Expression();
        // System.out.println(exp.isBalanced("(1+1)"));
        // System.out.println(exp.isBalanced("(1+1"));
        // System.out.println(exp.isBalanced("((1+1)"));
        // System.out.println(exp.isBalanced(")1+1("));

        // var myStack = new MyStack();
        // myStack.push(10);
        // myStack.push(20);
        // myStack.push(30);
        // System.out.println(myStack.peek());
        // System.out.println(myStack);
        // myStack.pop();
        // System.out.println(myStack);

        var stack = new com.nocoffeeneedded.Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());
    }

    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<Integer>();

        while (!queue.isEmpty()) {
            var item = queue.remove();
            stack.add(item);
        }

        while (!stack.isEmpty()) {
            var item = stack.pop();
            queue.add(item);
        }
    }

    public static void queue() {
        // Queue<Integer> queue = new ArrayDeque<>();

        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
        // System.out.println(queue);

        // reverseQueue(queue);
        // System.out.println(queue);

        // var queue = new MyArrayQueue(5);

        // queue.enqueue(10);
        // queue.enqueue(20);
        // queue.enqueue(30);
        // queue.dequeue();
        // queue.enqueue(60);
        // queue.enqueue(70);
        // System.out.println("isFull: " + queue.isFull());
        // System.out.println(queue);
        // queue.dequeue();
        // queue.dequeue();
        // queue.dequeue();
        // queue.dequeue();
        // System.out.println(queue);
        // System.out.println("isEmpty: " + queue.isEmpty());

        // var queue = new QueueWithTwoStacks();
        // queue.enqueue(10);
        // queue.enqueue(20);
        // queue.enqueue(30);
        // queue.dequeue();
        // queue.dequeue();
        // var first = queue.dequeue();
        // System.out.println(first);

        var queue = new MyPriorityQueue(5);
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(1);
        queue.enqueue(6);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }

    public static void main(String[] args) {
        queue();
    }
}
