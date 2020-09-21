package com.mogu.util;

import com.mogu.easy.ListNode;

/**
 * Created with IntelliJ IDEA.
 * User: dinghw
 * Date: 2020/9/21
 * Time: 17:22
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class LinkedListUtils {

    public static void print(String desc, ListNode listNode, int n) {
        System.out.print(desc + "链表：");
        while (listNode != null) {
            System.out.print(listNode.getVal());
            if (listNode.getNext() != null) {
                System.out.print("->");
            }
            listNode = listNode.getNext();
        }
        System.out.println("");
        System.out.println(desc + "数字：" + n);
    }

    public static void printCommon(String desc, ListNode listNode) {
        System.out.print(desc + "链表：");
        while (listNode != null) {
            System.out.print(listNode.getVal());
            if (listNode.getNext() != null) {
                System.out.print("->");
            }
            listNode = listNode.getNext();
        }
        System.out.println("");
    }
}