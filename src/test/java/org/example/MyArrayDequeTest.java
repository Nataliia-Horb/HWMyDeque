package org.example;

import org.junit.Assert;

import java.util.Optional;

import static org.junit.Assert.*;

public class MyArrayDequeTest {

    MyArrayDeque deque = new MyArrayDeque(5);

    @org.junit.Test
    public void addToHead() {
        deque.addToHead(3);
        deque.addToHead(5);
        deque.print();
    }

    @org.junit.Test
    public void addToTail() {
        deque.addToTail(8);
        deque.addToTail(80);
        deque.print();
    }

    @org.junit.Test
    public void removeHead() {
        deque.addToHead(3);
        deque.addToHead(5);
        deque.addToTail(8);
        deque.removeHead();
        deque.print();
    }

    @org.junit.Test
    public void removeTail() {
        deque.addToHead(3);
        deque.addToHead(5);
        deque.addToTail(8);
        deque.removeTail();
        deque.print();
    }

    @org.junit.Test
    public void peekHead() {
        deque.addToHead(3);
        deque.addToHead(5);
        deque.addToTail(8);
        deque.addToHead(10);
        deque.addToTail(4);
        Assert.assertEquals((Integer) 10, deque.peekHead());
    }

    @org.junit.Test
    public void peekTail() {
        deque.addToHead(3);
        deque.addToHead(5);
        deque.addToTail(8);
        deque.addToHead(10);
        deque.addToTail(4);
        Assert.assertEquals((Integer) 4, deque.peekTail());

    }

    @org.junit.Test
    public void isEmpty() {

    }

    @org.junit.Test
    public void getByIndex() {
        deque.addToHead(3);
        deque.addToHead(5);
        deque.addToTail(8);
        deque.addToHead(10);
        deque.addToTail(4);
        deque.print();
        Assert.assertEquals((Integer) 3, deque.getByIndex(2));
        Assert.assertEquals((Integer) 5, deque.getByIndex(1));
        Assert.assertEquals((Integer) 4, deque.getByIndex(4));
    }

    @org.junit.Test
    public void contains() {
        deque.addToHead(33);
        deque.addToHead(15);
        deque.addToTail(8);
        deque.addToHead(100);
        deque.addToTail(44);
        deque.print();
        Assert.assertEquals(true, deque.contains(15));
        Assert.assertEquals(true, deque.contains(8));
        Assert.assertEquals(false, deque.contains(350));
    }

    @org.junit.Test
    public void size() {
        deque.addToHead(33);
        deque.addToHead(15);
        deque.addToTail(8);
        deque.addToHead(100);
        deque.addToTail(44);
        Assert.assertEquals(5, deque.size());

    }

    @org.junit.Test
    public void print() {
        deque.addToTail(77);
        deque.addToHead(115);
        deque.addToTail(44);
        deque.print();
    }

    @org.junit.Test
    public void grow() {
        deque.addToHead(1);
        deque.addToHead(15);
        deque.addToTail(8);
        deque.addToHead(100);
        deque.addToTail(44);
        deque.addToTail(18);
        deque.addToHead(100);
        deque.addToTail(4);
        deque.addToTail(83);
        deque.addToHead(100);
        deque.addToTail(54);
        deque.addToTail(77);
        deque.addToHead(115);
        deque.addToTail(44);
        deque.addToTail(44);
        deque.addToTail(36);
        deque.addToHead(115);
        deque.print();
        deque.addToTail(29);
        deque.print();
    }

    @org.junit.Test
    public void diminish() {
        deque.addToHead(1);
        deque.addToHead(15);
        deque.addToTail(8);
        deque.addToHead(100);
        deque.addToHead(100);
        deque.addToHead(250);
        deque.addToHead(100);
        deque.addToHead(250);
        deque.addToTail(44);
        deque.addToHead(100);
        deque.addToHead(100);
        deque.addToTail(54);
        deque.addToTail(77);
        deque.addToHead(115);
        deque.addToHead(115);
        deque.addToTail(44);
        deque.addToTail(18);
        deque.print();
        deque.removeHead();
        deque.removeHead();
        deque.removeHead();
        deque.removeTail();
        deque.removeTail();
        deque.removeTail();
        deque.removeTail();
        deque.print();
    }
}