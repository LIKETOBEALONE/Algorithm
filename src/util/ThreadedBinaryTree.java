package util;

public class ThreadedBinaryTree {

    ThreadedBinaryTreeNode root;

    ThreadedBinaryTreeNode pre;

    public void threadNodes() {
        threadNodes(root);
    }

    public void threadNodes(ThreadedBinaryTreeNode root) {

        if (root == null) {
            return;
        }


        threadNodes(root.leftTreeNode);
        if (root.leftTreeNode == null) {
            root.leftTreeNode = null;
            root.leftType = 1;

        }
        pre=root;
        threadNodes(root.rightTreeNode);

    }

    public ThreadedBinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(ThreadedBinaryTreeNode root) {
        this.root = root;
    }


    public void frontShow() {
        if (root != null)
            root.frontShow();
    }

    public void midShow() {
        if (root != null)
            root.midShow();
    }

    public void afterShow() {
        if (root != null)
            root.afterShow();
    }

    public ThreadedBinaryTreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    public void deleteNode(int i) {
        if (root.value == i) {
            root = null;
        } else {
            root.deleteNode(i);
        }
    }
}
