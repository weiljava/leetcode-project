package com.mogu.easy;

import java.util.List;

/**
 * PointerSolution
 *
 * @author kyli
 * @version 1.0
 * 2020/9/23 22:52
 */
public class PointerSolution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fastNode = head;
        ListNode slowNode = head;

        while (n-- != 0) {
            fastNode = fastNode.next;
        }

        if (fastNode.next == null) {
            head = head.next;
            return head;
        }

        while (fastNode.next != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        slowNode.next = slowNode.next.next;
        return head;

    }

}
