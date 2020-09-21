package com.mogu.easy;

import com.mogu.util.LinkedListUtils;

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
        if (head == null || head.getNext() == null) {
            return head;
        }
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

    /**
     * 双指针解题：https://pic.leetcode-cn.com/9ce26a709147ad9ce6152d604efc1cc19a33dc5d467ed2aae5bc68463fdd2888.gif
     *
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        ListNode curr = null;
        ListNode pre = head;
        while (pre != null) {
            ListNode nextNode = pre.getNext();
            pre.setNext(curr);
            curr = pre;
            pre = nextNode;
        }

        return curr;
    }

    /**
     * 合并两个有序链表
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1 == null && l2 == null) {
            return null;
        }

        ListNode i = l1;
        ListNode j = l2;
        boolean flag = true;
        while (j != null && i != null) {
            if (i.getVal() <= j.getVal()) {
                ListNode iNext = i.getNext();
                i.next = new ListNode(j.getVal(), iNext);
                j = j.getNext();
                i = iNext;
            } else {
                flag = false;
                ListNode jNext = j.getNext();
                if (jNext.val > i.getVal()) {
                    j.next = i;
                    j = jNext;
                    i = i.getNext();
                } else {
                    j = j.next;
                    continue;
                }
            }
        }
        LinkedListUtils.printCommon("过程l1", l1);
        LinkedListUtils.printCommon("过程l2", l2);
        return flag ? l1 : l2;
    }
}