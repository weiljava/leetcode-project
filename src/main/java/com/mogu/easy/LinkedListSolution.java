package com.mogu.easy;

/**
 * Created with IntelliJ IDEA.
 * User: dinghw
 * Date: 2020/9/18
 * Time: 15:42
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class LinkedListSolution {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    /**
     * 删除链表的倒数第N个节点
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn2925/
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.getNext() == null && n == 1) {
            return null;
        }
        ListNode node = new ListNode(0);
        node.setNext(head);
        ListNode newCode = new ListNode(0);
        newCode.setNext(head);
        int i = 0;
        int j = 0;
        while (newCode.getNext() != null) {
            newCode = newCode.getNext();
            if (i - j == n) {
                node = node.getNext();
                j++;
            }
            i++;
        }
        if (node.getNext().getNext() == null && n != 1) {
            return null;
        } else {
            node.setNext(node.getNext().getNext());
            return head;
        }
    }
}