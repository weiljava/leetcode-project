package com.mogu.easy;

import java.util.List;

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

        if (i == n) {
            //首位删除
            return head.getNext();
        } else if (node.getNext().getNext() == null && n != 1) {
            //末尾节点删除
            return null;
        } else {
            //中间节点删除
            node.setNext(node.getNext().getNext());
            return head;
        }
    }

    /**
     * 反转链表
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnnhm6/
     */
    public ListNode reverseList(ListNode head) {
        ListNode newCode = new ListNode(0);
        reverseList(newCode, head);
        return newCode.getNext();
    }

    private ListNode reverseList(ListNode newCode, ListNode head) {
        if (head.getNext() == null) {
            //最后一个元素
            newCode.setNext(head);
            return head;
        } else {
            newCode = reverseList(newCode, head.getNext());
            ListNode nextNode = new ListNode(head.getVal());
            newCode.setNext(nextNode);
            return nextNode;
        }
    }
}