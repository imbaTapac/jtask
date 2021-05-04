package com.tasks.java.leetcode.medium;

import java.util.Random;

public class SortLinkedList {
    public static void main(String[] args) {
        ListNode root = createList(10);
        System.out.println(root);
        System.out.println(sort(root));
    }

    static ListNode createList(int size) {
        Random random = new Random();
        ListNode root = new ListNode(0);
        ListNode current = root;
        int index = 0;
        while (index != size) {
            current.next = new ListNode(random.nextInt());
            current = current.next;
            index++;
        }
        return root;
    }

    static ListNode sort(ListNode root) {
        if (root == null || root.next == null) {
            return root;
        }
        ListNode mid = getMid(root);
        ListNode left = sort(root);
        ListNode right = sort(mid);
        return merge(left, right);
    }

    static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

   static ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}
