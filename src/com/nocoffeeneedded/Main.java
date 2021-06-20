package com.nocoffeeneedded;

public class Main {
    public static void main(String[] args) {
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
}
