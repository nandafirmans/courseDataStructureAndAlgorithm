package com.nocoffeeneedded;

import java.util.Arrays;
import java.util.NoSuchElementException;

// Linked lists are probably the most commonly used data structures after array.
// We used linked lists to store a list of an objects in sequence.
// As you can see here a linked lists consists of a group of nodes in a sequences.
// Each nodes holds 2 pieces of data, one is a value and other is the address of the next node in the list.
// So we say each node points to or references the next node.

public class LinkedList {
    private static class Node {
        private final Object value;
        private Node next;
        // private Node prev;

        public Node(Object value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public boolean isEmpty() {
        return first == null;
    }

    public void addFirst(Object value) {
        // O(1)
        var node = new Node(value);
        if (isEmpty())
            first = last = node;
        else {
            // first.prev = node;
            node.next = first;
            first = node;
        }

        size++;
    }

    public void addLast(Object value) {
        // O(1)
        var node = new Node(value);
        if (isEmpty())
            first = last = node;
        else {
            // node.prev = last;
            last.next = node;
            last = node;
        }
        size++;
    }

    public void removeFirst() {
        // O(1)
        if (isEmpty())
            throw new NoSuchElementException();

        if (isSingleItem())
            first = last = null;
        else {
            // if we directly delete the first element, it would not be deleted by the java
            // garbage collector,
            // because the first element pointing to the second element and so on.
            // so we needs to save the second element before delete the first element, by
            // that we are not losing track.
            var second = first.next;
            // second.prev = null;
            first.next = null;
            first = second;
        }

        size--;
    }

    public void removeLast() {
        // O(n)
        if (isEmpty())
            throw new NoSuchElementException();

        if (isSingleItem())
            first = last = null;
        else {
            var prevNode = getPreviousOf(last);
            if (prevNode == null)
                return;

            last = prevNode;
            // last = last.prev;
            last.next = null;
        }

        size--;
    }

    private boolean isSingleItem() {
        return first == last;
    }

    private Node getPreviousOf(Node node) {
        var cursor = first;
        while (cursor != null) {
            if (cursor.next == node)
                return cursor;
            cursor = cursor.next;
        }
        return null;
    }

    public int indexOf(Object value) {
        // O(n)
        var cursor = first;
        for (int i = 0; cursor != null; i++) {
            if (cursor.value == value)
                return i;
            cursor = cursor.next;
        }
        return -1;
    }

    public boolean contains(Object value) {
        // O(n)
        return indexOf(value) != -1;

        /*
         * var cursor = first; while (cursor != null) { if (cursor.value == value)
         * return true; cursor = cursor.next; }
         *
         * return false;
         */
    }

    public int size() {
        // O(1)
        return size;

        /*
         * // O(n) var result = 0; var cursor = first; while (cursor != null) {
         * result++; cursor = cursor.next; } return result;
         */
    }

    public Object[] toArray() {
        // O(n)
        var array = new Object[size];
        var cursor = first;

        for (int i = 0; cursor != null; i++) {
            array[i] = cursor.value;
            cursor = cursor.next;
        }

        return array;
    }

    public void reversed() {
        if (isEmpty())
            return;

        var previous = first;
        var current = first.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;

        // var list = new LinkedList();
        // var cursorLast = first;
        // while (cursorLast != null) {
        // list.addFirst(cursorLast.value);
        // cursorLast = cursorLast.next;
        // }
        // first = list.first;
        // last = list.last;
    }

    public Object getKthFromTheEnd(int k) {
        if (isEmpty())
            throw new IllegalStateException();

        var a = first;
        var b = first;

        for (var i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalArgumentException();
        }

        while (b != last) {
            a = a.next;
            b = b.next;
        }

        return a.value;
    }

    public void printMiddle() {
        var a = first;
        var b = first;
        while (b != last && b.next != last) {
            b = b.next.next;
            a = a.next;
        }

        if (b == last)
            System.out.println(a.value);
        else
            System.out.println(a.value + ", " + a.value);
    }

    public void print() {
        var cursor = first;
        while (cursor != null) {
            System.out.println(cursor.value);
            cursor = cursor.next;
        }
    }
}
