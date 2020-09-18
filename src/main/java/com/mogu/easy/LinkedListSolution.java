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
        ListNode node = head;
        ListNode newCode = head;
        int i = 1;
        while (head.getNext() != null) {
            head = head.getNext();
            i++;
        }
        int j = 1;
        while (node.getNext() != null) {
            if (j == i - n) {
                newCode.setNext(newCode.getNext().getNext());
            }
            node = node.getNext();
            j++;
        }
        System.out.println(i);
        return newCode;
    }
}