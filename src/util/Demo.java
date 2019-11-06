package util;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(9);
        list.add(100);
        list.add(105);
        int num = 7;
        System.out.println(findMiniDifferenceNumbers(list, num));

    }

    static List<Integer> findMiniDifferenceNumbers(List<Integer> list, int num) {
        int i = 1;
        while (list != null) {

            int[] newArr = new int[list.size()];
            newArr[i] = list.get(i);
        }

        return list;
    }
}
