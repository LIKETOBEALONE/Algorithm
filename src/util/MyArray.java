package util;

import java.util.Arrays;

public class MyArray {
    private int[] elements;

    public MyArray() {
        this.elements = new int[0];
    }

    public int size() {
        return elements.length;
    }


    public void add(int element) {
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    public void delete(int index) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("Stackoverflow");

        }


        int[] newArr = new int[elements.length - 1];

        for (int i = 0; i < newArr.length; i++) {

            if (i < index) {


                newArr[i] = elements[i];

            } else {
                newArr[i] = elements[i + 1];
            }
        }
        elements = newArr;
        //     System.out.println(Arrays.toString(array));


    }

    public int get(int index) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("Stackoverflow");

        }
        return elements[index];

    }

    public void insert(int index, int element) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("Stackoverflow");

        }
        int[] newArr = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            if (i < index) {
                newArr[i] = elements[i];

            } else {
                newArr[i + 1] = elements[i];
            }
        }
        newArr[index] = element;
        elements = newArr;
    }

    public void setElements(int index, int element) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("Stackoverflow");

        }
        elements[index] = element;
    }

    public int search(int target) {

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int bisectionSearch(int target) {

        int begin = 0;
        int end = elements.length - 1;
        int mid = (begin + end) / 2;

        while (true) {
            if (begin > end) {
                return -1;
            }
            if (elements[mid] == target) {
                return mid;
            } else {
                if (elements[mid] > target) {
                    end = mid - 1;

                } else {
                    begin = mid + 1;

                }
                mid = (begin + end) / 2;
            }
        }

    }


    @Override
    public String toString() {
        return "MyArray{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
