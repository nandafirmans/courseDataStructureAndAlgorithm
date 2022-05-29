package com.nocoffeeneedded.mySolutions;

public class MyArray {
    private Object[] _items;

    public MyArray(int length) {
        _items = new Object[length];
    }

    private void _insertIntoNewArray(Object item) {
        var newArrays = new Object[_items.length + 1];
        System.arraycopy(_items, 0, newArrays, 0, _items.length); // O(n)
        newArrays[newArrays.length - 1] = item;
        _items = newArrays;
    }

    public void insert(Object item) {
        var lastEmptyIndex = indexof(null); // O(n)

        if (lastEmptyIndex == -1)
            _insertIntoNewArray(item); // O(n)
        else
            _items[lastEmptyIndex] = item;
    }

    public void removeAt(int index) {
        var newArrays = new Object[_items.length - 1];
        var newArrIndex = 0;
        for (int i = 0; i < _items.length; i++) { // O(n)
            if (i == index) continue;
            newArrays[newArrIndex] = _items[i];
            newArrIndex++;
        }
        _items = newArrays;
    }

    public int indexof(Object item) {
        for (int i = 0; i < _items.length; i++)
            if (_items[i] == item)
                return i;
        return -1;
    }

    public void print() {
        for (Object item : _items)
            System.out.println(item);
    }
}
