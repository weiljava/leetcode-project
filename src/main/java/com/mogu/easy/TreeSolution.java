package com.mogu.easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: dinghw
 * Date: 2020/9/22
 * Time: 16:04
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class TreeSolution {

    /**
     * 二叉树的最大深度
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnd69e/
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int a = 1;
        a += maxDepth(root.left);
        int b = 1;
        b += maxDepth(root.right);
        return a > b ? a : b;
    }

    /**
     * 验证二叉搜索树
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn08xg/
     *
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        return inorder(root, list, true);
    }

    private boolean inorder(TreeNode root, List<Integer> list, boolean flag) {
        if (root != null) {
            flag = flag && inorder(root.left, list, flag);
            if (list.size() > 0 && list.get(list.size() - 1) >= root.val) {
                flag = false;
            }
            list.add(root.val);
            flag = flag && inorder(root.right, list, flag);
        }
        return flag;
    }

    /**
     * 对称二叉树
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xn7ihv/
     *
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        boolean a = true;
        a = a && isSymmetric(root.left, root.right);
        return a;
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == right && left == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

    /**
     * 二叉树的层序遍历
     * https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/xnldjj/
     * 借助队列的属性，采用广度优先遍历算法为核心
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> subList = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode tree = queue.poll();
                subList.add(tree.val);
                if (tree.left != null) {
                    queue.offer(tree.left);
                }
                if (tree.right != null) {
                    queue.offer(tree.right);
                }
            }
            lists.add(subList);
        }
        return lists;
    }

}