package com.mogu.easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListSolutionTest {

    private LinkedListSolution test;
    private long startTime;
    private long endTime;

    ListNode listNode;

    @BeforeEach
    void setUp() {
        test = new LinkedListSolution();
        listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode4.setNext(listNode5);
        listNode3.setNext(listNode4);
        listNode2.setNext(listNode3);
        listNode.setNext(listNode2);

        startTime = System.currentTimeMillis();
    }

    @AfterEach
    void tearDown() {
        endTime = System.currentTimeMillis();
        System.out.println("方法耗时：" + (endTime - startTime) + "ms");
    }

    @Test
    void deleteNode() {
        print("输入", listNode);
        test.deleteNode(listNode);
        print("输出", listNode);
    }

    @Test
    void removeNthFromEnd() {
        print("输入", listNode);
        ListNode node = test.removeNthFromEnd(listNode, 2);
        print("输出", node);
    }

    private void print(String desc, ListNode listNode) {
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