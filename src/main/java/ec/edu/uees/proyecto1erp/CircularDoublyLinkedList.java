/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uees.proyecto1erp;

/**
 *
 * @author Vivobook Pro OLED
 */
public class CircularDoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Node<T> getNode(int index) {
        if (index < 0 || index >= this.size)
            return null;
        Node<T> p = this.head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p;
    }
    
    public Node<T> getFirstNode() {
        return head;
    }

    public Node<T> getLastNode() {
        return tail;
    }

    public Node<T> getNextNode(Node<T> node) {
        return node != null ? node.next : null;
    }


    public Node<T> getPreviousNode(Node<T> node) {
        return node != null ? node.prev : null;
    }

    public static class Node<T> {
        private T data;
        private Node<T> prev;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNextNode(Node<T> node) {
            return node != null ? node.next : null;
        }       

        public Node<T> getPreviousNode(Node<T> node) {
            return node != null ? node.prev : null;
        }

    }
}
