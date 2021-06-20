package com.nocoffeeneedded;

import java.util.Arrays;

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
        list.addFirst(1);
        list.removeLast();
        //list.removeFirst();
        list.print();
        System.out.println("\n");
        System.out.println(list.indexOf(20));
        System.out.println(list.contains(1));
        System.out.println(list.size());
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static void main(String[] args) {
        linkedList();
    }
}
