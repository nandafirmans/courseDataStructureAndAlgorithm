package com.nocoffeeneedded;

import java.util.Stack;

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
        var exp = new Expression();
        System.out.println(exp.isBalanced("(1+1)"));
        System.out.println(exp.isBalanced("(1+1"));
        System.out.println(exp.isBalanced("((1+1)"));
        System.out.println(exp.isBalanced(")1+1("));
    }

    public static void main(String[] args) {
        stack();
    }
}
