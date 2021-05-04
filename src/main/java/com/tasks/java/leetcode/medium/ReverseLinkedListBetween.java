package com.tasks.java.leetcode.medium;

public class ReverseLinkedListBetween {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        System.out.println(reverseBetween(listNode,3,4));
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return null;
        }
        if(n == m) {
            return head;
        }
        int size = getSize(head);
        if (n < 1 || m < 1 || n > size || m > size) {
            System.err.println("Error");
            System.exit(0);
        }

        if (n == size) {
            if (m == 1) {
                return reverse(head);
            }
            ListNode subNode = getSubNode(head, m,n);
            subNode = reverse(subNode);
            head = setNode(head, m, subNode);
            return head;
        } else {
            ListNode tail = getTail(head, n);
            ListNode subNode = getSubNode(head, m, n);
            subNode = reverse(subNode);
            head = setNode(head, m, subNode);
            head = setLast(head, tail);
        }

        return head;
    }

    public static ListNode reverse(ListNode head) {
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

    public static String printNode(ListNode listNode) {
        StringBuilder sb = new StringBuilder();
        ListNode curr = listNode;
        while (curr != null) {
            sb.append(curr.val)
                    .append("->");
            curr = curr.next;
        }
        return sb.toString();
    }

    public static int getSize(ListNode listNode) {
        int size = 0;
        ListNode curr = listNode;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }

    public static ListNode getSubNode(ListNode node, int from, int to) {
        ListNode current = node;
        current = remove(current, to);
        current = getNode(node, from);
        return current;
    }

    public static ListNode getTail(ListNode head, int indexFrom) {
        if (head == null) {
            return null;
        } else if (indexFrom == 0) {
            return head.next;
        } else {
            ListNode n = head;
            for (int i = 0; i < indexFrom - 1; i++) {
                n = n.next;
            }
            n = n.next;
            return n;
        }
    }

    public static ListNode remove(ListNode head, int position) {
        if (head == null) {
            return null;
        } else if (position == 1) {
            return head.next;
        } else {
            ListNode n = head;
            for (int i = 0; i < position - 1; i++) {
                n = n.next;
            }
            n.next = null;
            return head;
        }
    }


    public static ListNode setNode(ListNode head, int position, ListNode elem) {
        if (head == null) {
            return null;
        } else if (position == 1) {
            head = elem;
            return head;
        } else {
            ListNode current = head;
            ListNode previous = null;

            int i = 0;

            while (i < position - 1) {
                previous = current;
                current = current.next;

                if (current == null) {
                    break;
                }

                i++;
            }

            previous.next = elem;
            return previous;
        }
    }

    public static ListNode setLast(ListNode head, ListNode tail) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = tail;
        return head;
    }

    public static ListNode getNode(ListNode node, int index) {
        if (node == null) {
            return null;
        } else if (index == 1) {
            return node;
        } else {
            ListNode n = node;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            return n;
        }
    }
}
