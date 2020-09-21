package com.mogu.easy;

import com.mogu.util.LinkedListUtils;
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
        listNode4.next = listNode5;
        listNode3.next = listNode4;
        listNode2.next = listNode3;
        listNode.next = listNode2;

        startTime = System.currentTimeMillis();
    }

    @AfterEach
    void tearDown() {
        endTime = System.currentTimeMillis();
        System.out.println("方法耗时：" + (endTime - startTime) + "ms");
    }

    @Test
    void deleteNode() {
        LinkedListUtils.print("输入", listNode, 0);
        test.deleteNode(listNode);
        LinkedListUtils.printCommon("输出", listNode);
    }

    @Test
    void removeNthFromEnd() {
        LinkedListUtils.print("输入", listNode, 2);
        LinkedListUtils.printCommon("输出", test.removeNthFromEnd(listNode, 2));
    }

    @Test
    void removeNthFromEnd2() {
        LinkedListUtils.print("输入", listNode, 1);
        LinkedListUtils.printCommon("输出", test.removeNthFromEnd(listNode, 1));
    }

    @Test
    void removeNthFromEnd3() {
        LinkedListUtils.print("输入", listNode5, 1);
        LinkedListUtils.printCommon("输出", test.removeNthFromEnd(listNode5, 1));
    }

    @Test
    void removeNthFromEnd4() {
        LinkedListUtils.print("输入", listNode4, 1);
        LinkedListUtils.printCommon("输出", test.removeNthFromEnd(listNode4, 1));
    }

    @Test
    void removeNthFromEnd5() {
        //此场景未通过
        LinkedListUtils.print("输入", listNode4, 2);
        LinkedListUtils.printCommon("输出", test.removeNthFromEnd(listNode4, 2));
    }

    @Test
    void reverseList() {
        LinkedListUtils.printCommon("输入", listNode);
        LinkedListUtils.printCommon("输出", test.reverseList2(listNode));
    }

    @Test
    void reverseList2() {
        LinkedListUtils.printCommon("输入", listNode4);
        LinkedListUtils.printCommon("输出", test.reverseList2(listNode4));
    }

    @Test
    void reverseList3() {
        LinkedListUtils.printCommon("输入", listNode5);
        LinkedListUtils.printCommon("输出", test.reverseList2(listNode5));
    }

    @Test
    void mergeTwoLists() {
        ListNode listNode = new ListNode(5);
        ListNode listNode2 = new ListNode(6);
        ListNode listNode4 = new ListNode(7);
        listNode2.next = listNode4;
        listNode.next = listNode2;

        ListNode listNode1 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode3;

        LinkedListUtils.printCommon("输入", listNode);
        LinkedListUtils.printCommon("输入", listNode1);
        LinkedListUtils.printCommon("输出", test.mergeTwoLists(listNode, listNode1));
    }

    @Test
    void mergeTwoLists2() {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1);
        LinkedListUtils.printCommon("输入", listNode2);
        LinkedListUtils.printCommon("输入", listNode1);
        LinkedListUtils.printCommon("输出", test.mergeTwoLists(listNode2, listNode1));
    }

    @Test
    void mergeTwoLists3() {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode4 = new ListNode(4);
        listNode2.next = listNode4;
        listNode.next = listNode2;

        ListNode listNode1 = new ListNode(1);
        ListNode listNode3 = new ListNode(3);
        listNode3.next = listNode4;
        listNode1.next = listNode3;

        LinkedListUtils.printCommon("输入", listNode);
        LinkedListUtils.printCommon("输入", listNode1);
        LinkedListUtils.printCommon("输出", test.mergeTwoLists(listNode, listNode1));
    }

}