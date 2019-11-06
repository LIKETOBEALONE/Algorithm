package util;

public class ThreadedBinaryTreeNode {

    int value;

    ThreadedBinaryTreeNode leftTreeNode;

    ThreadedBinaryTreeNode rightTreeNode;

    int leftType;
    int rightType;

    public ThreadedBinaryTreeNode(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ThreadedBinaryTreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(ThreadedBinaryTreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public ThreadedBinaryTreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(ThreadedBinaryTreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }

    public void frontShow() {

        System.out.println(value);
        if (leftTreeNode != null) {
            leftTreeNode.frontShow();
        }
        if (rightTreeNode != null) {
            rightTreeNode.frontShow();
        }

    }

    public void midShow() {
        if (leftTreeNode != null) {
            leftTreeNode.midShow();
        }
        System.out.println(value);
        if (rightTreeNode != null) {
            rightTreeNode.midShow();
        }
    }

    public void afterShow() {
        if (leftTreeNode != null) {
            leftTreeNode.afterShow();
        }

        if (rightTreeNode != null) {
            rightTreeNode.afterShow();
        }
        System.out.println(value);
    }

    public ThreadedBinaryTreeNode frontSearch(int i) {
        ThreadedBinaryTreeNode target = null;
        if (this.value == i) {
            return this;
        } else {
            if (leftTreeNode != null) {
                target = leftTreeNode.frontSearch(i);

            }
            if (target != null) {
                return target;
            }
            if (rightTreeNode != null) {
                target = rightTreeNode.frontSearch(i);
            }
        }
        return target;
    }

    public void deleteNode(int i) {
        ThreadedBinaryTreeNode parent = this;
        if (parent.leftTreeNode != null && parent.leftTreeNode.value == i) {
            parent.leftTreeNode = null;

            return;
        }
        if (parent.rightTreeNode != null && parent.rightTreeNode.value == i) {
            parent.rightTreeNode = null;
            return;

        }

        parent = leftTreeNode;
        if (parent != null) {
            parent.deleteNode(i);
        }
        parent = rightTreeNode;
        if (parent != null) {
            parent.deleteNode(i);
        }


    }
}
