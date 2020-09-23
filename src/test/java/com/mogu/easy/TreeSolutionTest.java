package com.mogu.easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeSolutionTest {

    private TreeSolution test;
    private long startTime;
    private long endTime;

    @BeforeEach
    void setUp() {
        test = new TreeSolution();
        startTime = System.currentTimeMillis();
    }

    @AfterEach
    void tearDown() {
        endTime = System.currentTimeMillis();
        System.out.println("方法耗时：" + (endTime - startTime) + "ms");
    }

    @Test
    void maxDepth() {
        TreeNode root = new TreeNode(5);
        root.setLeft(new TreeNode(9));

        TreeNode node2 = new TreeNode(20);
        node2.setLeft(new TreeNode(3));
        node2.setRight(new TreeNode(6));
        root.setRight(node2);

        Assertions.assertEquals(test.maxDepth(root), 3);
    }

    @Test
    void isValidBST() {
        TreeNode root = new TreeNode(5);
        root.setLeft(new TreeNode(3));

        TreeNode node2 = new TreeNode(4);
        node2.setLeft(new TreeNode(3));
        node2.setRight(new TreeNode(21));

        root.setRight(node2);
        Assertions.assertEquals(test.isValidBST(root), false);
    }

    @Test
    void isValidBST2() {
        TreeNode root = new TreeNode(5);
        root.setLeft(new TreeNode(1));

        TreeNode node2 = new TreeNode(20);
        node2.setLeft(new TreeNode(3));
        node2.setRight(new TreeNode(21));

        root.setRight(node2);
        Assertions.assertEquals(test.isValidBST(root), false);
    }

    @Test
    void isValidBST3() {
        TreeNode root = new TreeNode(0);
        root.setLeft(new TreeNode(-1));
        Assertions.assertEquals(test.isValidBST(root), true);
    }

    @Test
    void isValidBST4() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(1));
        Assertions.assertEquals(test.isValidBST(root), false);
    }
}