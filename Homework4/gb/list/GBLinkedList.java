package Homework4.gb.list;

import Homework4.gb.GBList;

import java.util.Iterator;

public class GBLinkedList<T> implements GBList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public GBLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(T data) {
        addLast(data);
        return true;
    }

    @Override
    public void remove(int index) {
        removeLast();
    }

    @Override
    public T get(int index) {
        getByIndex(index);
        return null;
    }

    @Override
    public void update(int index, T t) {
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data, head, null);
        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<T>(data, null, tail);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
        size++;
    }

    public void addAtPos(int index, T data) {
        if (index < 0 || index > this.size()) {
            throw new IllegalArgumentException("Invalid Index");
        } else if (index == 0) {
            this.addFirst(data);
        } else if (index == this.size()) {
            this.addLast(data);
        } else {
            Node<T> newNode = new Node<T>(data);
            Node<T> currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode;
            newNode.previous = currentNode.previous;
            currentNode.previous = newNode;
            newNode.previous.next = newNode;
            size++;
        }
    }

    public void removeFirst() {
        if (this.isEmpty()) {
            System.out.println("List is empty");
        } else {
            if (head.next == null) {
                tail = null;
            } else {
                head.next.previous = null;
            }
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        if (this.isEmpty()) {
            System.out.println("List is empty");
        } else {
            if (head.next == null) {
                head = null;
            } else {
                tail.previous.next = null;
            }
            tail = tail.previous;
            size--;
        }
    }

    public void removeAtPos(int index) {
        if (index < 0 || index > this.size()) {
            throw new IllegalArgumentException("Invalid Index");
        } else if (index == 0) {
            this.removeFirst();
        } else if (index == this.size() - 1) {
            this.removeLast();
        } else {
            Node<T> currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            currentNode.previous.next = currentNode.next;
            currentNode.next.previous = currentNode.previous;
            size--;
        }
    }

    public void getFirst() {
        Node<T> currentNode = head;
        System.out.println(currentNode.data);
    }

    public void getLast() {
        Node<T> currentNode = tail;
        System.out.println(currentNode.data);
    }

    public void getByIndex(int index) {
        if (index < 0 || index > this.size()) {
            throw new IllegalArgumentException("Invalid Index");
        }
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
    }
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;
        private Node<T> previous;

        public Node(T data, Node<T> next, Node<T> previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

        public Node(T data) {
            this(data, null, null);
        }
    }
}

