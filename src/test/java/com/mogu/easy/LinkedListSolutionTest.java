package com.mogu.easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListSolutionTest {

    private LinkedListSolution test;
    private long startTime;
    private long endTime;

    ListNode listNode;
    ListNode listNode2;
    ListNode listNode3;
    ListNode listNode4;
    ListNode listNode5;

    @BeforeEach
    void setUp() {
        test = new LinkedListSolution();
        listNode = new ListNode(1);
        listNode2 = new ListNode(2);
        listNode3 = new ListNode(3);
        listNode4 = new ListNode(4);
        listNode5 = new ListNode(5);
        listNode4.setNext(listNode5);
        listNode3.setNext(listNode4);
        listNode2.setNext(listNode3);
        listNode.setNext(listNode2);

        startTime = System.currentTimeMillis();
    }

    private void print(String desc, ListNode listNode, int n) {
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

    private void printCommon(String desc, ListNode listNode) {
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

    @AfterEach
    void tearDown() {
        endTime = System.currentTimeMillis();
        System.out.println("方法耗时：" + (endTime - startTime) + "ms");
    }

    @Test
    void deleteNode() {
        print("输入", listNode, 0);
        test.deleteNode(listNode);
        printCommon("输出", listNode);
    }

    @Test
    void removeNthFromEnd() {
        print("输入", listNode, 2);
        printCommon("输出", test.removeNthFromEnd(listNode, 2));
    }

    @Test
    void removeNthFromEnd2() {
        print("输入", listNode, 1);
        printCommon("输出", test.removeNthFromEnd(listNode, 1));
    }

    @Test
    void removeNthFromEnd3() {
        print("输入", listNode5, 1);
        printCommon("输出", test.removeNthFromEnd(listNode5, 1));
    }

    @Test
    void removeNthFromEnd4() {
        print("输入", listNode4, 1);
        printCommon("输出", test.removeNthFromEnd(listNode4, 1));
    }

    @Test
    void removeNthFromEnd5() {
        //此场景未通过
        print("输入", listNode4, 2);
        printCommon("输出", test.removeNthFromEnd(listNode4, 2));
    }

    @Test
    void reverseList() {
        printCommon("输入", listNode);
        printCommon("输出", test.reverseList(listNode));
    }

    @Test
    void reverseList2() {
        printCommon("输入", listNode4);
        printCommon("输出", test.reverseList(listNode4));
    }

    @Test
    void reverseList3() {
        printCommon("输入", listNode5);
        printCommon("输出", test.reverseList(listNode5));
    }
}