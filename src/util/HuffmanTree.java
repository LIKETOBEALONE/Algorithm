package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {

    public Node creatHuffmanTree(int[] arr){
        List<Node> nodes=new ArrayList<>();
        for (int value:arr){
            nodes.add(new Node(value));
        }
        while (nodes.size()>1){
            Collections.sort(nodes);
            Node left=nodes.get(nodes.size()-1);
            Node right=nodes.get(nodes.size()-2);
            Node parent=new Node(left.data+right.data);
            nodes.remove(left);
            nodes.remove(right);
            nodes.add(parent);

        }
        return nodes.get(0);

    }
}
