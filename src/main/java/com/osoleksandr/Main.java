package com.osoleksandr;

public class Main {

    public static final int MAX_NODE_VAL = 9;

    public ListNode addTwoNumbers(ListNode nodeOne, ListNode nodeTwo) {

        if (nodeOne == null) return null;

        ListNode tmp = nodeOne;

        int result;
        while (nodeOne != null) {
            result = nodeOne.val + nodeTwo.val;
            if (result > MAX_NODE_VAL) {
                nodeOne.val = result % 10;
                if (nodeOne.next == null) {
                    nodeOne.next = new ListNode(1);
                    if (nodeTwo.next == null) nodeTwo.next = new ListNode(0);
                } else nodeOne.next.val += 1;
            } else {
                nodeOne.val = result;
            }

            if (nodeOne.next == null && nodeTwo.next != null) nodeOne.next = new ListNode(0);
            if (nodeTwo.next == null && nodeOne.next != null) nodeTwo.next = new ListNode(0);

            nodeOne = nodeOne.next;
            nodeTwo = nodeTwo.next;
        }
        return tmp;
    }
}

