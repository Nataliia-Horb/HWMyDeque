package org.example;

public interface MyDeque {
    void addToHead(Integer element);
    void addToTail(Integer element);
    Integer removeHead();
    Integer removeTail();
    Integer peekHead();
    Integer peekTail();
    boolean isEmpty();
    Integer getByIndex(int index);
    boolean contains(Integer element);

    int size();


    // методы будут отвечать за увеличение колекции
    void grow();

    void diminish();
    int calculateNewCapacity(int currentCapacity);
    int calculateAdditionalCapacity(int currentCapacity);


}
