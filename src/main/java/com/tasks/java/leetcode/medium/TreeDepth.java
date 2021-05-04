package com.tasks.java.leetcode.medium;

import com.tasks.java.leetcode.medium.PrintBinaryTree.TreeNode;

public class TreeDepth {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        TreeNode left = new TreeNode(10);
        TreeNode right = new TreeNode(23);
        treeNode.left = left;
        treeNode.right = right;

        TreeNode rightLeaf1 = new TreeNode(12);
        TreeNode rightLeaf2 = new TreeNode(6);
        right.right = rightLeaf2;
        right.left = rightLeaf1;
        rightLeaf2.right = new TreeNode(1);

        System.out.println(maxTreeDepth(treeNode));
    }

    public static int maxTreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxLeftDepth = maxTreeDepth(root.left);
        int maxRightDepth = maxTreeDepth(root.right);
        return maxLeftDepth > maxRightDepth ? maxLeftDepth + 1 : maxRightDepth + 1;
    }
}
