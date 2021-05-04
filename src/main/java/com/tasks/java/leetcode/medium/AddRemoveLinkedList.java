package com.tasks.java.leetcode.medium;

import static java.util.Objects.nonNull;

public class AddRemoveLinkedList {
    public static void main(String[] args) {
        Node node = new Node();
        node.value = 1;
        Node node1 = new Node();
        node1.value = 2;
        Node node2 = new Node();
        node2.value = 3;
        node.next = node1;
        node1.next = node2;
        node1.prev = node;
        node2.prev = node1;

        LinkedList linkedList = new LinkedList();
        linkedList.head = node;
        linkedList.tail = node2;

        linkedList.remove(2);
        System.out.println(linkedList.toString());
    }

    static class Node {
        private Integer value;
        private Node next;
        private Node prev;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next.value +
                    ", prev=" + prev.value +
                    '}';
        }
    }

    static class LinkedList {
        private Node head;
        private Node tail;

        public void remove(Integer value) {
            Node current = head;

            if(current.value.equals(value)){
                current = current.next;
                current.next.prev = null;
            }
            while (nonNull(current.next)) {
                if(current.next.value.equals(value)){
                    current.next = current.next.next;
                    current.next.next.prev = current;
                    return;
                }
                if (current.value.equals(value)) {
                    Node next = current.next;
                    if (nonNull(next.next)) {
                        current.prev = next;
                        current.next = next.next;
                        return;
                    } else {
                        current.next = next;
                        return;
                    }
                } else {
                    current = current.next;
                }
            }
        }

        public void add(Integer prev, Integer next) {

        }

        @Override
        public String toString() {
            return "LinkedList{" +
                    "head=" + head +
                    ", tail=" + tail +
                    '}';
        }
    }
}
