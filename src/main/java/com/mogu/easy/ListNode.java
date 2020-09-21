package com.mogu.easy;

/**
 * Created with IntelliJ IDEA.
 * User: dinghw
 * Date: 2020/9/18
 * Time: 15:49
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class ListNode {
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

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}