package com.tasks.java.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class PrintBinaryTree {
    public static void main(String[] args) {

    }

    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> c = new ArrayList<>();
        return c;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
