package util;

import java.util.Collection;
import java.util.Collections;


public class Node  implements Comparable<Node>{

    int data;
    Node next;
    Node right;
    Node left;

    public Node(int data) {
        this.data = data;
    }

    public Node append(Node node) {
        Node currentNode = this;
        while (true) {
            Node nextNode = currentNode.next;
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = node;
        return this;
    }

    public void removeNext() {
        Node newNext = next.next;
        this.next = newNext;
    }

    public Node next() {
        return this.next;
    }

    public void show() {
        Node currentNode = this;
        while (true) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
            if (currentNode == null) {
                break;
            }
        }
    }



    public void insert(Node node) {
        Node nextNext = next;
        this.next = node;
        node.next = nextNext;
    }

    public int getData() {

        return this.data;

    }


    @Override
    public int compareTo(Node o) {
        return this.data-o.data;
    }
}
