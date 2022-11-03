package org.example;

import java.util.Arrays;
import java.util.Deque;

public class MyArrayDeque implements MyDeque {
    private Integer[] elements;
    private int headIndex;
    private int tailIndex;
    private int numberOfElements;

    private static final int INCREASE_CAPACITY = 10;


    public MyArrayDeque(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity must be 0 or higher!");
        }
        this.elements = new Integer[capacity];
        this.headIndex = this.tailIndex = elements.length / 2;
        this.numberOfElements = 0;
    }

    @Override
    public void addToHead(Integer element) {

        elements[headIndex] = element;
        if (numberOfElements == 0) {
            tailIndex++;
        }
        headIndex--;
        numberOfElements++;
        grow();
    }

    @Override
    public void addToTail(Integer element) {

        elements[tailIndex] = element;
        if (numberOfElements == 0) {
            headIndex--;
        }
        tailIndex++;
        numberOfElements++;
        grow();
    }

    @Override
    public Integer removeHead() {
        headIndex++;
        Integer headElement = elements[headIndex];
        elements[headIndex] = null;
        numberOfElements--;
        diminish();
        return headElement;
    }

    @Override
    public Integer removeTail() {
        tailIndex--;
        Integer tailElement = elements[tailIndex];
        elements[tailIndex] = null;
        numberOfElements--;
        diminish();
        return tailElement;
    }

    @Override
    public Integer peekHead() {
        return elements[headIndex + 1];
    }

    @Override
    public Integer peekTail() {
        return elements[tailIndex - 1];
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public Integer getByIndex(int index) {
        return elements[headIndex + index + 1];
    }


    @Override
    public boolean contains(Integer element) {
        for (int i = headIndex + 1; i < tailIndex; i++) {
            if (element.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    //+++
    @Override
    public int size() {
        return numberOfElements;
    }

    public void print() {
        System.out.println(Arrays.toString(elements));
    }

    @Override
    public void grow() {
        if ((headIndex < 0 || tailIndex >= elements.length)) {
            recalculate();
        }
    }

    @Override
    public void diminish() {
        if (elements.length > numberOfElements + INCREASE_CAPACITY) {
            recalculate();
        }
    }

    private void recalculate() {
        int additionalCapacity = INCREASE_CAPACITY / 2;
        int count = headIndex + 1;
        Integer[] elementsNewArrays = new Integer[numberOfElements + INCREASE_CAPACITY];
        for (int i = additionalCapacity; i < additionalCapacity + numberOfElements; i++) {
            elementsNewArrays[i] = elements[count];
            count++;
        }
        elements = elementsNewArrays;
        headIndex = additionalCapacity - 1;
        tailIndex = headIndex + numberOfElements + 1;
    }

    @Override
    public int calculateNewCapacity(int currentCapacity) {
        return 0;
    }

    @Override
    public int calculateAdditionalCapacity(int currentCapacity) {
        return 0;
    }
}
