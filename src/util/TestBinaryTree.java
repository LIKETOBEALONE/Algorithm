package util;

public class TestBinaryTree {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        TreeNode root = new TreeNode(1);

        binaryTree.setRoot(root);

        TreeNode rootL = new TreeNode(2);

        root.setLeftTreeNode(rootL);

        TreeNode rootR = new TreeNode(3);

        root.setRightTreeNode(rootR);

        rootL.setLeftTreeNode(new TreeNode(4));

        rootL.setRightTreeNode(new TreeNode(5));

        rootR.setLeftTreeNode(new TreeNode(6));

        rootR.setRightTreeNode(new TreeNode(7));
        // System.out.println("+++++++++++++++++++++++++++++++++++");
        // binaryTree.frontShow();
        //  System.out.println("++++++++++++++++++++++++++++++++++++");
        //  binaryTree.midShow();
        //  System.out.println("++++++++++++++++++++++++++++++++");
        //   binaryTree.afterShow();
        //    System.out.println("++++++++++++++++++++++++++++++++++++");
        // TreeNode result = binaryTree.frontSearch(10);
        //System.out.println(result);
        // System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        //   binaryTree.deleteNode(1);

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(arr);

        arrayBinaryTree.frontShow();
    }

}
