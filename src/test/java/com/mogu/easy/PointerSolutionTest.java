package com.mogu.easy;

import com.sun.org.apache.xpath.internal.objects.XNodeSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * PointerSolutionTest
 *
 * @author kyli
 * @version 1.0
 * 2020/9/23 23:42
 */
class PointerSolutionTest {
    private PointerSolution test;
    private long startTime;
    private long endTime;

    @BeforeEach
    void setUp() {
        test = new PointerSolution();
        startTime = System.currentTimeMillis();
    }

    @AfterEach
    void tearDown() {
        endTime = System.currentTimeMillis();
        System.out.println("方法耗时：" + (endTime - startTime) + "ms");
    }

    @Test
    void removeNthFromEnd() {
        ListNode listNode = new ListNode(1);
        ListNode addNode;
        ListNode temp = listNode;
        for (int i = 2; i < 10; i++) {
            addNode = new ListNode(i);
            temp.next = addNode;
            temp = temp.next;
        }
        /*listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);*/

        ListNode listNode1 = test.removeNthFromEnd(listNode, 2);
        while (listNode1 != null) {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
        System.out.println(listNode1);

    }
}