package com.tasks.java.leetcode.medium;

import java.util.concurrent.Future;
import java.util.stream.Stream;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.val = 1;
        list.next = new ListNode(2);
        System.out.println(reverseList(list));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode nextNode = null;
        while (current != null) {
            nextNode = current.next;

            current.next = previous;
            previous = current;

            current = nextNode;

        }
        head = previous;
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}